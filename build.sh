
mkdir serenity

mvn clean verify serenity:aggregate -Dwebdriver.driver=chrome -Pserenity
mv  target/site/serenity serenity/firefox
mv  serenity target/site/serenity



echo done
