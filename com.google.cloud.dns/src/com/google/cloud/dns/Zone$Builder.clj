(ns com.google.cloud.dns.Zone$Builder
  "Builder for Zone."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Zone$Builder]))

(defn set-name
  "Description copied from class: ZoneInfo.Builder

  name - `java.lang.String`

  returns: `com.google.cloud.dns.Zone$Builder`"
  (^com.google.cloud.dns.Zone$Builder [^Zone$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-dns-name
  "Description copied from class: ZoneInfo.Builder

  dns-name - `java.lang.String`

  returns: `com.google.cloud.dns.Zone$Builder`"
  (^com.google.cloud.dns.Zone$Builder [^Zone$Builder this ^java.lang.String dns-name]
    (-> this (.setDnsName dns-name))))

(defn set-description
  "Description copied from class: ZoneInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.dns.Zone$Builder`"
  (^com.google.cloud.dns.Zone$Builder [^Zone$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn build
  "Description copied from class: ZoneInfo.Builder

  returns: `com.google.cloud.dns.Zone`"
  (^com.google.cloud.dns.Zone [^Zone$Builder this]
    (-> this (.build))))

