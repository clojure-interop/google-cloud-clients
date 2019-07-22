# Bindings for com.google.cloud.dns

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.dns "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **com.google.cloud.dns.ChangeRequest$Builder**
- class **com.google.cloud.dns.ChangeRequest**
- class **com.google.cloud.dns.ChangeRequestInfo$Builder**
- class **com.google.cloud.dns.ChangeRequestInfo$Status**
- class **com.google.cloud.dns.ChangeRequestInfo**
- enum **com.google.cloud.dns.Dns$ChangeRequestField**
- class **com.google.cloud.dns.Dns$ChangeRequestListOption**
- class **com.google.cloud.dns.Dns$ChangeRequestOption**
- enum **com.google.cloud.dns.Dns$ProjectField**
- class **com.google.cloud.dns.Dns$ProjectOption**
- enum **com.google.cloud.dns.Dns$RecordSetField**
- class **com.google.cloud.dns.Dns$RecordSetListOption**
- enum **com.google.cloud.dns.Dns$SortingOrder**
- enum **com.google.cloud.dns.Dns$ZoneField**
- class **com.google.cloud.dns.Dns$ZoneListOption**
- class **com.google.cloud.dns.Dns$ZoneOption**
- interface **com.google.cloud.dns.Dns**
- class **com.google.cloud.dns.DnsBatch**
- class **com.google.cloud.dns.DnsBatchResult**
- class **com.google.cloud.dns.DnsException**
- interface **com.google.cloud.dns.DnsFactory**
- class **com.google.cloud.dns.DnsOptions$Builder**
- class **com.google.cloud.dns.DnsOptions$DefaultDnsFactory**
- class **com.google.cloud.dns.DnsOptions$DefaultDnsRpcFactory**
- class **com.google.cloud.dns.DnsOptions**
- class **com.google.cloud.dns.ProjectInfo$Quota**
- class **com.google.cloud.dns.ProjectInfo**
- class **com.google.cloud.dns.RecordSet$Builder**
- class **com.google.cloud.dns.RecordSet$Type**
- class **com.google.cloud.dns.RecordSet**
- class **com.google.cloud.dns.Zone$Builder**
- class **com.google.cloud.dns.Zone**
- class **com.google.cloud.dns.ZoneInfo$Builder**
- class **com.google.cloud.dns.ZoneInfo**
- interface **com.google.cloud.dns.spi.DnsRpcFactory**
- class **com.google.cloud.dns.spi.v1.DnsRpc$ListResult**
- enum **com.google.cloud.dns.spi.v1.DnsRpc$Option**
- interface **com.google.cloud.dns.spi.v1.DnsRpc**
- class **com.google.cloud.dns.spi.v1.HttpDnsRpc**
- interface **com.google.cloud.dns.spi.v1.RpcBatch$Callback**
- interface **com.google.cloud.dns.spi.v1.RpcBatch**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
