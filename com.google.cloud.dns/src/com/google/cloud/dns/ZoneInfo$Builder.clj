(ns com.google.cloud.dns.ZoneInfo$Builder
  "Builder for ZoneInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns ZoneInfo$Builder]))

(defn ->builder
  "Constructor."
  (^ZoneInfo$Builder []
    (new ZoneInfo$Builder )))

(defn set-name
  "Sets a mandatory user-provided name for the zone. It must be unique within the project.

  name - `java.lang.String`

  returns: `com.google.cloud.dns.ZoneInfo$Builder`"
  (^com.google.cloud.dns.ZoneInfo$Builder [^ZoneInfo$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-dns-name
  "Sets a mandatory DNS name of this zone, for instance \"example.com.\".

  dns-name - `java.lang.String`

  returns: `com.google.cloud.dns.ZoneInfo$Builder`"
  (^com.google.cloud.dns.ZoneInfo$Builder [^ZoneInfo$Builder this ^java.lang.String dns-name]
    (-> this (.setDnsName dns-name))))

(defn set-description
  "Sets a mandatory description for this zone. The value is a string of at most 1024 characters
   which has no effect on the zone's function.

  description - `java.lang.String`

  returns: `com.google.cloud.dns.ZoneInfo$Builder`"
  (^com.google.cloud.dns.ZoneInfo$Builder [^ZoneInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn build
  "Builds the instance of ZoneInfo based on the information set by this builder.

  returns: `com.google.cloud.dns.ZoneInfo`"
  (^com.google.cloud.dns.ZoneInfo [^ZoneInfo$Builder this]
    (-> this (.build))))

