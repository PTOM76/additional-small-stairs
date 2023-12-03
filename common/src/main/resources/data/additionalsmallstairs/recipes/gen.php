<?php
foreach (glob('../../../assets/additionalsmallstairs/blockstates/*') as $file) {
	$file = basename($file);
	$id = preg_replace('/small_stairs_(.*)\.json/', "$1", $file);
	//echo $id . "\n";
	
	// small_stairs_xxx.json
$contents = <<<EOD
{
  "type": "minecraft:crafting_shaped",
  "pattern": [
    " #",
    "##"
  ],
  "key": {
    "#": {
      "item": "minecraft:{$id}"
    }
  },
  "result": {
    "item": "additionalsmallstairs:small_stairs_{$id}",
    "count": 6
  }
}
EOD;
	file_put_contents('small_stairs_' . $id . '.json', $contents);
}