(ns com.google.cloud.datastore.Key
  "A key that is guaranteed to be complete and could be used to reference a Google Cloud Datastore
  Entity. This class is immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Key]))

(defn *from-url-safe
  "Create a Key given its URL safe encoded form.

  url-safe - `java.lang.String`

  returns: `com.google.cloud.datastore.Key`

  throws: java.lang.IllegalArgumentException - when decoding fails"
  (^com.google.cloud.datastore.Key [^java.lang.String url-safe]
    (Key/fromUrlSafe url-safe)))

(defn *new-builder
  "project-id - `java.lang.String`
  kind - `java.lang.String`
  name - `java.lang.String`

  returns: `com.google.cloud.datastore.Key$Builder`"
  (^com.google.cloud.datastore.Key$Builder [^java.lang.String project-id ^java.lang.String kind ^java.lang.String name]
    (Key/newBuilder project-id kind name))
  (^com.google.cloud.datastore.Key$Builder [^com.google.cloud.datastore.IncompleteKey copy-from ^java.lang.String name]
    (Key/newBuilder copy-from name))
  (^com.google.cloud.datastore.Key$Builder [^com.google.cloud.datastore.Key copy-from]
    (Key/newBuilder copy-from)))

(defn has-id?
  "returns: `boolean`"
  (^Boolean [^Key this]
    (-> this (.hasId))))

(defn get-id
  "Returns the key's id or null if it has a name instead.

  returns: `java.lang.Long`"
  (^java.lang.Long [^Key this]
    (-> this (.getId))))

(defn has-name?
  "returns: `boolean`"
  (^Boolean [^Key this]
    (-> this (.hasName))))

(defn get-name
  "Returns the key's name or null if it has an id instead.

  returns: `java.lang.String`"
  (^java.lang.String [^Key this]
    (-> this (.getName))))

(defn get-name-or-id
  "Returns the key's ID (as Long) or name (as String). Never null.

  returns: `java.lang.Object`"
  (^java.lang.Object [^Key this]
    (-> this (.getNameOrId))))

(defn to-url-safe
  "Returns the key in an encoded form that can be used as part of a URL.

  returns: `java.lang.String`"
  (^java.lang.String [^Key this]
    (-> this (.toUrlSafe))))

