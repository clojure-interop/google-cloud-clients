(ns com.google.cloud.bigquery.Acl$Domain
  "Class for a BigQuery Domain entity. Objects of this class represent a domain to grant access
  to. Any users signed in with the domain specified will be granted the specified access."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Acl$Domain]))

(defn ->domain
  "Constructor.

  Creates a Domain entity given the domain name.

  domain - `java.lang.String`"
  (^Acl$Domain [^java.lang.String domain]
    (new Acl$Domain domain)))

(defn get-domain
  "Returns the domain name.

  returns: `java.lang.String`"
  (^java.lang.String [^Acl$Domain this]
    (-> this (.getDomain))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Acl$Domain this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Acl$Domain this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Acl$Domain this]
    (-> this (.toString))))

