filename='reverse_array'
git stash
git pull origin master
echo 'synced'
cd ./src
javac ${filename}.java
java $filename