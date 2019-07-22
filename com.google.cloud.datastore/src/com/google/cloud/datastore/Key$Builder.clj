(ns com.google.cloud.datastore.Key$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Key$Builder]))

(defn set-name
  "Sets the name of this key.

  name - `java.lang.String`

  returns: `com.google.cloud.datastore.Key$Builder`"
  (^com.google.cloud.datastore.Key$Builder [^Key$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-id
  "Sets the ID of this key.

  id - `long`

  returns: `com.google.cloud.datastore.Key$Builder`"
  (^com.google.cloud.datastore.Key$Builder [^Key$Builder this ^Long id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.datastore.Key`"
  (^com.google.cloud.datastore.Key [^Key$Builder this]
    (-> this (.build))))

