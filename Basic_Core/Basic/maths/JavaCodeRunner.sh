#!/bin/bash
# Description: Script to compile and run Java source files
# Author: AdamsGeeky
# Date: 10/03/2024

# Check if javac is available
if ! command -v javac &> /dev/null; then
    echo "Error: javac not found. Make sure Java Development Kit (JDK) is installed and in your PATH."
    exit 1
fi

# Check if java is available
if ! command -v java &> /dev/null; then
    echo "Error: java not found. Make sure Java Runtime Environment (JRE) is installed and in your PATH."
    exit 1
fi

# Check if the correct number of arguments is provided (command and filename)
if [ $# -ne 2 ]; then
    echo "Usage: $0 <compile|run|execute> <filename>"
    exit 1
fi

# Set the filename, output folder, and source folder
filename=$2
output_folder="bycode"
source_folder="source"

# Create the output folder if it doesn't exist
if [ ! -d "$output_folder" ]; then
    mkdir "$output_folder"
fi

# Compile the source file
if [ "$1" == "compile" ]; then
    javac -d "$output_folder" "$source_folder/$filename.java"
    exit 0
fi

# Run or execute the source file
if [ "$1" == "run" ] || [ "$1" == "execute" ]; then
    if [ ! -f "$output_folder/$filename.class" ]; then
        # If the class file doesn't exist, run the source file
        java "$source_folder/$filename.java"
    fi
    exit 0
fi

# Invalid command
echo "Invalid command: $1"
exit 1
