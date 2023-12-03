<?php
foreach (glob('../../blockstates/*') as $file) {
	$file = basename($file);
	$id = preg_replace('/small_stairs_(.*)\.json/', "$1", $file);
	//echo $id . "\n";
	
	// small_stairs_xxx.json
$contents = <<<EOD
{
  "parent": "smallstairs:block/smallstairs",
  "textures": {
    "bottom": "minecraft:block/{$id}",
    "top": "minecraft:block/{$id}",
    "side": "minecraft:block/{$id}"
  }
}
EOD;
	file_put_contents('small_stairs_' . $id . '.json', $contents);
	
	// small_stairs_xxx_inner.json
$inner_contents = <<<EOD
{
  "parent": "smallstairs:block/inner_smallstairs",
  "textures": {
    "bottom": "minecraft:block/{$id}",
    "top": "minecraft:block/{$id}",
    "side": "minecraft:block/{$id}"
  }
}
EOD;
	file_put_contents('small_stairs_' . $id . '_inner.json', $inner_contents);
	
	// small_stairs_xxx_outer.json
$outer_contents = <<<EOD
{
  "parent": "smallstairs:block/outer_smallstairs",
  "textures": {
    "bottom": "minecraft:block/{$id}",
    "top": "minecraft:block/{$id}",
    "side": "minecraft:block/{$id}"
  }
}
EOD;
	file_put_contents('small_stairs_' . $id . '_outer.json', $outer_contents);

}