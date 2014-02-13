#!/bin/bash

echo "Compressing..."
for f in *; do
	if [[ -d "$f/src"  ]]; then
		rm "$f.zip"
		zip -r "$f" "$f" -i "$f/src/*"
	fi
done
