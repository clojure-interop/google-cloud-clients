(ns com.google.cloud.datastore.BaseEntity
  "A base class for entities (key and properties). An entity is a Google Cloud Datastore persistent
  data object. An entity holds one or more properties, represented by a name (as String)
  and a value (as Value), and may be associated with a key. For
  a list of possible values see ValueType."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore BaseEntity]))

(defn get-entity
  "Returns the property value as an entity.

  name - `java.lang.String`

  returns: `<K extends com.google.cloud.datastore.IncompleteKey> com.google.cloud.datastore.FullEntity<K>`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  ([^BaseEntity this ^java.lang.String name]
    (-> this (.getEntity name))))

(defn null?
  "Returns true if property is an instance of NullValue.

  name - `java.lang.String`

  returns: `boolean`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  (^Boolean [^BaseEntity this ^java.lang.String name]
    (-> this (.isNull name))))

(defn get-string
  "Returns the property value as a string.

  name - `java.lang.String`

  returns: `java.lang.String`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  (^java.lang.String [^BaseEntity this ^java.lang.String name]
    (-> this (.getString name))))

(defn contains
  "Returns true if the entity contains a property with the given name.

  name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^BaseEntity this ^java.lang.String name]
    (-> this (.contains name))))

(defn get-key
  "Returns the property value as a Key.

  name - `java.lang.String`

  returns: `com.google.cloud.datastore.Key`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  (^com.google.cloud.datastore.Key [^BaseEntity this ^java.lang.String name]
    (-> this (.getKey name)))
  ([^BaseEntity this]
    (-> this (.getKey))))

(defn get-timestamp
  "Returns the property value as a Timestamp.

  name - `java.lang.String`

  returns: `com.google.cloud.Timestamp`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  (^com.google.cloud.Timestamp [^BaseEntity this ^java.lang.String name]
    (-> this (.getTimestamp name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseEntity this]
    (-> this (.toString))))

(defn get-value
  "Returns the Value for the given property name.

  name - `java.lang.String`

  returns: `<V extends com.google.cloud.datastore.Value<?>> V`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  ([^BaseEntity this ^java.lang.String name]
    (-> this (.getValue name))))

(defn get-blob
  "Returns the property value as a blob.

  name - `java.lang.String`

  returns: `com.google.cloud.datastore.Blob`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  (^com.google.cloud.datastore.Blob [^BaseEntity this ^java.lang.String name]
    (-> this (.getBlob name))))

(defn get-long
  "Returns the property value as long.

  name - `java.lang.String`

  returns: `long`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  (^Long [^BaseEntity this ^java.lang.String name]
    (-> this (.getLong name))))

(defn get-properties
  "Returns the properties.

  returns: `java.util.Map<java.lang.String,com.google.cloud.datastore.Value<?>>`"
  (^java.util.Map [^BaseEntity this]
    (-> this (.getProperties))))

(defn get-lat-lng
  "Returns the property value as a LatLng.

  name - `java.lang.String`

  returns: `com.google.cloud.datastore.LatLng`

  throws: com.google.cloud.datastore.DatastoreException - if no such property."
  (^com.google.cloud.datastore.LatLng [^BaseEntity this ^java.lang.String name]
    (-> this (.getLatLng name))))

(defn get-list
  "Returns the property value as a list of values.

  name - `java.lang.String`

  returns: `<T extends com.google.cloud.datastore.Value<?>> java.util.List<T>`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  ([^BaseEntity this ^java.lang.String name]
    (-> this (.getList name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BaseEntity this]
    (-> this (.hashCode))))

(defn get-boolean?
  "Returns the property value as a boolean.

  name - `java.lang.String`

  returns: `boolean`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  (^Boolean [^BaseEntity this ^java.lang.String name]
    (-> this (.getBoolean name))))

(defn has-key?
  "Returns true if entity has a non-null key.

  returns: `boolean`"
  (^Boolean [^BaseEntity this]
    (-> this (.hasKey))))

(defn get-double
  "Returns the property value as a double.

  name - `java.lang.String`

  returns: `double`

  throws: com.google.cloud.datastore.DatastoreException - if no such property"
  (^Double [^BaseEntity this ^java.lang.String name]
    (-> this (.getDouble name))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseEntity this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-names
  "Returns the properties name.

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^BaseEntity this]
    (-> this (.getNames))))

