ProtocolSupport
===============

[![Build Status](http://build.true-games.org/buildStatus/icon?job=ProtocolSupport)](http://build.true-games.org/job/ProtocolSupport/)
[![Join the chat at https://gitter.im/ProtocolSupport/ProtocolSupport](https://badges.gitter.im/ProtocolSupport/ProtocolSupport.svg)](https://gitter.im/ProtocolSupport/ProtocolSupport?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
<span class="badge-paypal"><a href="https://www.paypal.com/cgi-bin/webscr?return=&business=true-games.org%40yandex.ru&bn=PP-DonationsBF%3Abtn_donateCC_LG.gif%3ANonHosted&cmd=_donations&rm=1&no_shipping=1&currency_code=USD" title="Donate to this project using Paypal"><img src="https://img.shields.io/badge/paypal-donate-yellow.svg" alt="PayPal donate button" /></a></span>

Support 1.10, 1.9, 1.8, 1.7, 1.6, 1.5, 1.4.7 on spigot 1.11

Important notes:
* Only latest version of this plugin is supported
* This plugin can't be reloaded or loaded not at server startup
* This plugin doesn't work with netty native transport

Wontfix issues:
* [Anything that is not latest] Items in creative mode may not work as expected, or may not work at all
* [1.8 and earlier] Thrown potion texture is invalid
* [1.8 and earlier] Can't control vehicle
* [1.6 and earlier] Stats are not sent

================

Spigot: http://www.spigotmc.org/resources/protocolsupport.7201/

Jenkins: https://ci.potestas.xyz/job/ProtocolSupport/

Maven:
```
<repositories>
	<repository>
		<id>potestas-repo</id>
		<url>https://mvn.potestas.xyz/</url>
	</repository>
</repositories>
<dependencies>
    <!--ProtocolSupport API-->
    <dependency>
           <groupId>protocolsupport</groupId>
           <artifactId>protocolsupport</artifactId>
           <version>4.25.dev</version>
           <scope>provided</scope>
    </dependency>
</dependencies>
```

================

Licensed under the terms of GNU AGPLv3
