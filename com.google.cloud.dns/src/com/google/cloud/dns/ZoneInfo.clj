(ns com.google.cloud.dns.ZoneInfo
  "A Zone represents a DNS zone hosted by the Google Cloud DNS service. A zone is a subtree
  of the DNS namespace under one administrative responsibility. See Google Cloud DNS documentation for
  more information."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns ZoneInfo]))

(defn *of
  "Returns a ZoneInfo object with assigned name, dnsName and description.

  name - `java.lang.String`
  dns-name - `java.lang.String`
  description - `java.lang.String`

  returns: `com.google.cloud.dns.ZoneInfo`"
  (^com.google.cloud.dns.ZoneInfo [^java.lang.String name ^java.lang.String dns-name ^java.lang.String description]
    (ZoneInfo/of name dns-name description)))

(defn get-name-servers
  "The nameservers that the zone should be delegated to. This is defined by the Google DNS cloud.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ZoneInfo this]
    (-> this (.getNameServers))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ZoneInfo this]
    (-> this (.toString))))

(defn get-name
  "Returns the user-defined name of the zone.

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneInfo this]
    (-> this (.getName))))

(defn get-description
  "Returns the description of this zone.

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneInfo this]
    (-> this (.getDescription))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ZoneInfo this]
    (-> this (.hashCode))))

(defn get-name-server-set
  "Returns the optionally specified set of DNS name servers that all host this zone. This value is
   set only for specific use cases and is left empty for vast majority of users.

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneInfo this]
    (-> this (.getNameServerSet))))

(defn get-generated-id
  "Returns the service-generated id for this zone.

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneInfo this]
    (-> this (.getGeneratedId))))

(defn get-dns-name
  "Returns the DNS name of this zone, for instance \"example.com.\".

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneInfo this]
    (-> this (.getDnsName))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ZoneInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-creation-time-millis
  "Returns the time when this zone was created on the server.

  returns: `java.lang.Long`"
  (^java.lang.Long [^ZoneInfo this]
    (-> this (.getCreationTimeMillis))))

(defn to-builder
  "Returns a builder for ZoneInfo prepopulated with the metadata of this zone.

  returns: `com.google.cloud.dns.ZoneInfo$Builder`"
  (^com.google.cloud.dns.ZoneInfo$Builder [^ZoneInfo this]
    (-> this (.toBuilder))))

