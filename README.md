# spring-boot-mariadb-learning



## Installation

```java
<dependency>
            <groupId>org.mariadb.jdbc</groupId>
            <artifactId>mariadb-java-client</artifactId>
            <version>2.7.3</version>
        </dependency>
```

```java
spring.datasource.url=jdbc:mariadb://localhost:3306/productDB
spring.datasource.username=root
spring.datasource.password=
```

## Document

---
# **MariaDB vs MySQL**

MySQL,İlişkisel bir veritabanının tüm geleneksel özellikleriyle, yani bina tabloları, kısıtlamalar, görünümler, vb. İle çalışır.

MariaDB ise MySQL veritabanının önceden yapılandırılmış tüm ilişkisel özelliklerini içeren çatallı bir sürümüdür. MySQL ile aynı veritabanı yapısını ve indeksleri kullanır ve oldukça benzer şekilde çalışır.



| MariaDB | MySQL |
| --- | --- |
| MariaDB, C, C ++, Bash &amp; Perl dillerinde yazılmıştır, bu yüzden MySQL ile karşılaştırıldığında biraz daha gelişmiş kabul edilir. | MySQL, C ve C ++ olmak üzere iki dil kullanılarak geliştirilmiştir. Hafif bir veritabanıdır ve neredeyse tüm işletim sistemlerinde çalışır. |
| MariaDB, küçük bir değişiklikle benzer bir sürece sahiptir. Sadece &#39;Master&#39;ın&#39; Slave &#39;veri aktarımına izin vermekle kalmaz, aynı zamanda&#39; Master&#39;ın &#39;Master&#39; çoğaltmasına da izin verir. | MySQL, eşzamansız çoğaltma sunar, yani tek yönlü bir işlemdir. Verileri &#39;Slave&#39; veritabanlarına kopyalamak için &#39;Ana&#39; veritabanlarına yetki verir, tüm tabloları ve öznitelikleri bir kerede çoğaltır. |
| MariaDB, çok ana düğümler için gelişmiş çoğaltma gerçekleştirmek için Galera Kümesi&#39;ni kullanır. Sadece yapılandırma parametrelerini etkinleştirerek MariaDB&#39;de kolayca etkinleştirilebilir. | Tek bir düğüme yalnızca bir hata veya bağımlılık noktası olmadığından emin olmak için yöneticilerin iki aşamalı bir kesinleştirme mekanizması aracılığıyla farklı düğümlere veri yazmalarına izin verir. |
| MariaDB, C, C ++, Bash &amp; Perl dillerinde yazılmıştır, bu yüzden MySQL ile karşılaştırıldığında biraz daha gelişmiş kabul edilir. Microsoft Windows, Linux, OS X, FreeBSD, OpenBSD, Solaris ve diğerleri için kullanılabilir kurulum ikili dosyalarına sahiptir. | Linux, Microsoft Windows, OS X, AIX, FreeBSD, HP-UX, BSDi, Novell Netware, NetBSD ve daha fazlası için ikili dosyalara sahiptir. |

Hem MySQL hem de MariaDB dizinleri (PRIMARY KEY, UNIQUE, INDEX ve FULLTEXT) B ağaçlarında saklar. Ayrıca indekslerde, uzamsal veri türleri olan ve R ağaçlarında saklanan bazı istisnalar vardır.

Bu geleneksel dizinler dışında MySQL de karma dizinleri destekler ve ters FULLTEXT dizinleri listesini saklamak için InnoDB motorunu kullanır.

---

## Document(For English)


MySQL, with all the possible features of a relational database, with constraints i.e. building tables, etc. To forward.

MariaDB, on the other hand, is a forked version of all the structured content of the MySQL database. Putting it in the same file as MySQL and making the indexes available for association.

---
| MariaDB | MySQL |
| --- | --- |
| MariaDB, C, C++, Bash &amp; It is written in Perl languages ​​so it is considered a bit more advanced when compared to MySQL. | MySQL is developed using two languages, C and C++. It is a lightweight database and runs on almost all operating systems. |
| MariaDB has a similar process with one minor change. Just 'Master's' The slave not only allows 'data transfer, but also' Master's 'Master' It also allows replication. | MySQL offers asynchronous replication, meaning it is a one-way operation. Data 'Slave' 'Main' for copying to databases delegates databases, replicates all tables and attributes at once. |
| MariaDB uses Galera Cluster to perform advanced replication for multi-master nodes. It can be easily enabled in MariaDB just by enabling the configuration parameters. | It allows administrators to write data to different nodes through a two-stage commit mechanism to ensure that there is not just one point of failure or dependency on a single node. |
| MariaDB, C, C++, Bash &amp; It is written in Perl languages ​​so it is considered a bit more advanced when compared to MySQL. It has installation binaries available for Microsoft Windows, Linux, OS X, FreeBSD, OpenBSD, Solaris, and more. | It has binaries for Linux, Microsoft Windows, OS X, AIX, FreeBSD, HP-UX, BSDi, Novell Netware, NetBSD and more. |

Both MySQL and MariaDB store indexes (PRIMARY KEY, UNIQUE, INDEX and FULLTEXT) in B trees. There are also some exceptions to indexes, which are spatial data types and stored in R trees.

Apart from these traditional indexes, MySQL also supports hash indexes and uses the InnoDB engine to store the reverse FULLTEXT indexes list.



[Muharrem Koç](https://github.com/muharremkoc)
