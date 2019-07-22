(ns com.google.cloud.compute.v1.NamedPort$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NamedPort$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NamedPort`

  returns: `com.google.cloud.compute.v1.NamedPort$Builder`"
  (^com.google.cloud.compute.v1.NamedPort$Builder [^NamedPort$Builder this ^com.google.cloud.compute.v1.NamedPort other]
    (-> this (.mergeFrom other))))

(defn get-name
  "The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^NamedPort$Builder this]
    (-> this (.getName))))

(defn set-name
  "The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NamedPort$Builder`"
  (^com.google.cloud.compute.v1.NamedPort$Builder [^NamedPort$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-port
  "The port number, which can be a value between 1 and 65535.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NamedPort$Builder this]
    (-> this (.getPort))))

(defn set-port
  "The port number, which can be a value between 1 and 65535.

  port - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.NamedPort$Builder`"
  (^com.google.cloud.compute.v1.NamedPort$Builder [^NamedPort$Builder this ^java.lang.Integer port]
    (-> this (.setPort port))))

(defn build
  "returns: `com.google.cloud.compute.v1.NamedPort`"
  (^com.google.cloud.compute.v1.NamedPort [^NamedPort$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NamedPort$Builder`"
  (^com.google.cloud.compute.v1.NamedPort$Builder [^NamedPort$Builder this]
    (-> this (.clone))))

