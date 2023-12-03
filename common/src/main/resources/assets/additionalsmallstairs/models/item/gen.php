<?php
foreach (glob('../../blockstates/*') as $file) {
	$file = basename($file);
	$id = preg_replace('/small_stairs_(.*)\.json/', "$1", $file);
	//echo $id . "\n";
$contents = <<<EOD
{
  "parent": "additionalsmallstairs:block/small_stairs_{$id}"
}
EOD;
	file_put_contents('small_stairs_' . $id . '.json', $contents);
}