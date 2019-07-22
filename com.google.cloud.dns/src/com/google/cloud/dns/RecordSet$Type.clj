(ns com.google.cloud.dns.RecordSet$Type
  "Enum for the DNS record types supported by Cloud DNS.

  Google Cloud DNS currently supports records of type A, AAAA, CNAME, MX NAPTR, NS, PTR, SOA,
  SPF, SRV, TXT."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns RecordSet$Type]))

(def *-a
  "Static Constant.

  Address record, which is used to map host names to their IPv4 address.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/A)

(def *-aaaa
  "Static Constant.

  IPv6 Address record, which is used to map host names to their IPv6 address.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/AAAA)

(def *-cname
  "Static Constant.

  Canonical name record, which is used to alias names.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/CNAME)

(def *-mx
  "Static Constant.

  Mail exchange record, which is used in routing requests to mail servers.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/MX)

(def *-naptr
  "Static Constant.

  Naming authority pointer record, defined by RFC3403.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/NAPTR)

(def *-ns
  "Static Constant.

  Name server record, which delegates a DNS zone to an authoritative server.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/NS)

(def *-ptr
  "Static Constant.

  Pointer record, which is often used for reverse DNS lookups.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/PTR)

(def *-soa
  "Static Constant.

  Start of authority record, which specifies authoritative information about a DNS zone.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/SOA)

(def *-spf
  "Static Constant.

  Sender policy framework record, which is used in email validation systems.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/SPF)

(def *-srv
  "Static Constant.

  Service locator record, which is used by some voice over IP, instant messaging protocols and
   other applications.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/SRV)

(def *-txt
  "Static Constant.

  Text record, which can contain arbitrary text and can also be used to define machine readable
   data such as security or abuse prevention information.

  type: com.google.cloud.dns.RecordSet$Type"
  RecordSet$Type/TXT)

(defn *value-of-strict
  "Get the Type for the given String constant, and throw an exception if the constant is not
   recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.dns.RecordSet$Type`"
  (^com.google.cloud.dns.RecordSet$Type [^java.lang.String constant]
    (RecordSet$Type/valueOfStrict constant)))

(defn *value-of
  "Get the Type for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.dns.RecordSet$Type`"
  (^com.google.cloud.dns.RecordSet$Type [^java.lang.String constant]
    (RecordSet$Type/valueOf constant)))

(defn *values
  "Return the known values for Type.

  returns: `com.google.cloud.dns.RecordSet$Type[]`"
  ([]
    (RecordSet$Type/values )))

