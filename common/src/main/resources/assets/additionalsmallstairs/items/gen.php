<?php
foreach (glob('../blockstates/*') as $file) {
	$file = basename($file);
	$id = preg_replace('/(.*)\.json/', "$1", $file);
$contents = <<<EOD
{
  "model": {
    "type": "minecraft:model",
    "model": "additionalsmallstairs:item/{$id}"
  }
}
EOD;
	file_put_contents($id . '.json', $contents);
}