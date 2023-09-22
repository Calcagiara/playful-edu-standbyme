# playful-edu-standbyme

This component performs import data between a WordPress instance in Stand By Me Project and the Playful Education Platform.

The following ENV variables must be set:
- SBM_ENDPOINT : endpoint of WordPress instance, like https://standbymeplatform.eu/wp-json/wp/v2
- SBM_CRON : cron expression for scheduling the import, like 0 30 \* \* \* ?
- PLAYFUL_DOMAINS : a list of domain ids in Playful platform that must be aligned, like <id1&gt;,<id2&gt;
- PLAYFUL_ENDPOINT :  endpoint of Playful Platform, like http://localhost:8445/playfuledu/api