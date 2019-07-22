(ns com.google.cloud.datastore.PathElement
  "Represents a single element in a key's path."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore PathElement]))

(defn *of
  "kind - `java.lang.String`
  name - `java.lang.String`

  returns: `com.google.cloud.datastore.PathElement`"
  (^com.google.cloud.datastore.PathElement [^java.lang.String kind ^java.lang.String name]
    (PathElement/of kind name)))

(defn get-kind
  "Returns the kind of this path element.

  returns: `java.lang.String`"
  (^java.lang.String [^PathElement this]
    (-> this (.getKind))))

(defn has-name?
  "returns: `boolean`"
  (^Boolean [^PathElement this]
    (-> this (.hasName))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PathElement this]
    (-> this (.toString))))

(defn get-name
  "Returns the name of this path element.

  returns: `java.lang.String`"
  (^java.lang.String [^PathElement this]
    (-> this (.getName))))

(defn has-id?
  "returns: `boolean`"
  (^Boolean [^PathElement this]
    (-> this (.hasId))))

(defn get-id
  "Returns the ID of this path element.

  returns: `java.lang.Long`"
  (^java.lang.Long [^PathElement this]
    (-> this (.getId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PathElement this]
    (-> this (.hashCode))))

(defn get-name-or-id
  "Returns the path element's ID (as Long) or name (as String). Never null.

  returns: `java.lang.Object`"
  (^java.lang.Object [^PathElement this]
    (-> this (.getNameOrId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PathElement this ^java.lang.Object obj]
    (-> this (.equals obj))))

