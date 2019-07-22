(ns com.google.cloud.datastore.BaseEntity$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore BaseEntity$Builder]))

(defn set-key
  "Sets the key for the entity.

  key - `K`

  returns: `B`"
  ([^BaseEntity$Builder this key]
    (-> this (.setKey key))))

(defn clear
  "Clears all the properties.

  returns: `B`"
  ([^BaseEntity$Builder this]
    (-> this (.clear))))

(defn remove
  "Removes a property with the given name.

  name - `java.lang.String`

  returns: `B`"
  ([^BaseEntity$Builder this ^java.lang.String name]
    (-> this (.remove name))))

(defn set
  "Sets a list property containing elements of type StringValue.

  name - name of the property - `java.lang.String`
  first - the first string in the list - `java.lang.String`
  second - the second string in the list - `java.lang.String`
  others - other strings in the list - `java.lang.String`

  returns: `B`"
  ([^BaseEntity$Builder this ^java.lang.String name ^java.lang.String first ^java.lang.String second ^java.lang.String others]
    (-> this (.set name first second others)))
  ([^BaseEntity$Builder this ^java.lang.String name ^com.google.cloud.datastore.Value value]
    (-> this (.set name value))))

(defn set-null
  "Sets a property of type NullValue.

  name - name of the property - `java.lang.String`

  returns: `B`"
  ([^BaseEntity$Builder this ^java.lang.String name]
    (-> this (.setNull name))))

(defn build
  "returns: `com.google.cloud.datastore.BaseEntity<K>`"
  (^com.google.cloud.datastore.BaseEntity [^BaseEntity$Builder this]
    (-> this (.build))))

