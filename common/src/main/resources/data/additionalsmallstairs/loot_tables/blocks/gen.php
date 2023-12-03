<?php
foreach (glob('../../../../assets/additionalsmallstairs/blockstates/*') as $file) {
	$file = basename($file);
	$id = preg_replace('/small_stairs_(.*)\.json/', "$1", $file);
	//echo $id . "\n";
	
	// small_stairs_xxx.json
$contents = <<<EOD
{
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "additionalsmallstairs:small_stairs_{$id}"
        }
      ],
      "conditions": [
        {
          "condition": "minecraft:survives_explosion"
        }
      ]
    }
  ]
}
EOD;
	file_put_contents('small_stairs_' . $id . '.json', $contents);
}