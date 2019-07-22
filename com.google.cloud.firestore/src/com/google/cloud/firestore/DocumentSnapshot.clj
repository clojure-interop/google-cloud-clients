(ns com.google.cloud.firestore.DocumentSnapshot
  "A DocumentSnapshot contains data read from a document in a Firestore database. The data can be
  extracted with the getData() or get(String) methods.

  If the DocumentSnapshot points to a non-existing document, getData() and its corresponding
  methods will return null. You can always explicitly check for a document's existence by calling
  exists().

  Subclassing Note: Firestore classes are not meant to be subclassed except for use in
  test mocks. Subclassing is not supported in production code and new SDK releases may break code
  that does so."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore DocumentSnapshot]))

(defn get-geo-point
  "Returns the value of the field as a GeoPoint.

  field - The path to the field. - `java.lang.String`

  returns: The value of the field. - `com.google.cloud.firestore.GeoPoint`

  throws: java.lang.RuntimeException - if the value is not a GeoPoint."
  (^com.google.cloud.firestore.GeoPoint [^DocumentSnapshot this ^java.lang.String field]
    (-> this (.getGeoPoint field))))

(defn get-data
  "Returns the fields of the document as a Map or null if the document doesn't exist. Field values
   will be converted to their native Java representation.

  returns: The fields of the document as a Map or null if the document doesn't exist. - `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^DocumentSnapshot this]
    (-> this (.getData))))

(defn get-create-time
  "Returns the time at which this document was created. Returns null for non-existing documents.

  returns: The last time the document in the snapshot was created. Null if the document doesn't
       exist. - `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^DocumentSnapshot this]
    (-> this (.getCreateTime))))

(defn to-object
  "Returns the contents of the document converted to a POJO or null if the document doesn't exist.

  value-type - The Java class to create - `java.lang.Class`

  returns: The contents of the document in an object of type T or null if the document doesn't
       exist. - `<T> T`"
  ([^DocumentSnapshot this ^java.lang.Class value-type]
    (-> this (.toObject value-type))))

(defn get-string
  "Returns the value of the field as a String.

  field - The path to the field. - `java.lang.String`

  returns: The value of the field. - `java.lang.String`

  throws: java.lang.RuntimeException - if the value is not a String."
  (^java.lang.String [^DocumentSnapshot this ^java.lang.String field]
    (-> this (.getString field))))

(defn contains
  "Returns whether or not the field exists in the document. Returns false if the document does not
   exist.

  field - the path to the field. - `java.lang.String`

  returns: true iff the field exists. - `boolean`"
  (^Boolean [^DocumentSnapshot this ^java.lang.String field]
    (-> this (.contains field))))

(defn get-timestamp
  "Returns the value of the field as a Timestamp.

   This method ignores the global setting FirestoreOptions.areTimestampsInSnapshotsEnabled().

  field - The path to the field. - `java.lang.String`

  returns: The value of the field. - `com.google.cloud.Timestamp`

  throws: java.lang.RuntimeException - if the value is not a Date."
  (^com.google.cloud.Timestamp [^DocumentSnapshot this ^java.lang.String field]
    (-> this (.getTimestamp field))))

(defn get-reference
  "Gets the reference to the document.

  returns: The reference to the document. - `com.google.cloud.firestore.DocumentReference`"
  (^com.google.cloud.firestore.DocumentReference [^DocumentSnapshot this]
    (-> this (.getReference))))

(defn get-blob
  "Returns the value of the field as a Blob.

  field - The path to the field. - `java.lang.String`

  returns: The value of the field. - `com.google.cloud.firestore.Blob`

  throws: java.lang.RuntimeException - if the value is not a Blob."
  (^com.google.cloud.firestore.Blob [^DocumentSnapshot this ^java.lang.String field]
    (-> this (.getBlob field))))

(defn get-date
  "Returns the value of the field as a Date.

   This method ignores the global setting FirestoreOptions.areTimestampsInSnapshotsEnabled().

  field - The path to the field. - `java.lang.String`

  returns: The value of the field. - `java.util.Date`

  throws: java.lang.RuntimeException - if the value is not a Date."
  (^java.util.Date [^DocumentSnapshot this ^java.lang.String field]
    (-> this (.getDate field))))

(defn get-long
  "Returns the value of the field as a long.

  field - The path to the field. - `java.lang.String`

  returns: The value of the field. - `java.lang.Long`

  throws: java.lang.RuntimeException - if the value is not a Number."
  (^java.lang.Long [^DocumentSnapshot this ^java.lang.String field]
    (-> this (.getLong field))))

(defn get-id
  "Returns the ID of the document contained in this snapshot.

  returns: The id of the document. - `java.lang.String`"
  (^java.lang.String [^DocumentSnapshot this]
    (-> this (.getId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DocumentSnapshot this]
    (-> this (.hashCode))))

(defn get-boolean?
  "Returns the value of the field as a boolean.

  field - The path to the field. - `java.lang.String`

  returns: The value of the field. - `java.lang.Boolean`

  throws: java.lang.RuntimeException - if the value is not a Boolean."
  (^java.lang.Boolean [^DocumentSnapshot this ^java.lang.String field]
    (-> this (.getBoolean field))))

(defn exists?
  "Returns whether or not the field exists in the document. Returns false if the document does not
   exist.

  returns: whether the document existed in this snapshot. - `boolean`"
  (^Boolean [^DocumentSnapshot this]
    (-> this (.exists))))

(defn get-read-time
  "Returns the time at which this snapshot was read.

  returns: The read time of this snapshot. - `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^DocumentSnapshot this]
    (-> this (.getReadTime))))

(defn get-double
  "Returns the value of the field as a double.

  field - The path to the field. - `java.lang.String`

  returns: The value of the field. - `java.lang.Double`

  throws: java.lang.RuntimeException - if the value is not a Number."
  (^java.lang.Double [^DocumentSnapshot this ^java.lang.String field]
    (-> this (.getDouble field))))

(defn get-update-time
  "Returns the time at which this document was last updated. Returns null for non-existing
   documents.

  returns: The last time the document in the snapshot was updated. Null if the document doesn't
       exist. - `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^DocumentSnapshot this]
    (-> this (.getUpdateTime))))

(defn get
  "Returns the value at the field or null if the field doesn't exist.

  field - The path to the field. - `java.lang.String`

  returns: The value at the given field or null. - `java.lang.Object`"
  (^java.lang.Object [^DocumentSnapshot this ^java.lang.String field]
    (-> this (.get field))))

(defn equals
  "Returns true if the document's data and path in this DocumentSnapshot equals the provided
   snapshot.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this DocumentSnapshot is equal to the provided object. - `boolean`"
  (^Boolean [^DocumentSnapshot this ^java.lang.Object obj]
    (-> this (.equals obj))))

