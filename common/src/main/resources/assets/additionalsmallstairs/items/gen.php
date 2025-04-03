<?php
foreach (glob('../blockstates/*') as $file) {
	$id = preg_replace('/(.*)\.json/', "$1", basename($file));
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
