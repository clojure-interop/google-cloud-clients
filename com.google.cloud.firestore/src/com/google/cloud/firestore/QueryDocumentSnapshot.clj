(ns com.google.cloud.firestore.QueryDocumentSnapshot
  "A QueryDocumentSnapshot contains data read from a document in a Firestore database as part of a
  query. The document is guaranteed to exist and its data can be extracted using the getData() or DocumentSnapshot.get(String) methods.

  QueryDocumentSnapshot offers the same API surface as DocumentSnapshot. Since query
  results contain only existing documents, the DocumentSnapshot.exists() method will always return true and
  getData() will never be null.

  Subclassing Note: Firestore classes are not meant to be subclassed except for use in
  test mocks. Subclassing is not supported in production code and new SDK releases may break code
  that does so."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore QueryDocumentSnapshot]))

(defn get-data
  "Returns the fields of the document as a Map. Field values will be converted to their native
   Java representation.

  returns: The fields of the document as a Map. - `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^QueryDocumentSnapshot this]
    (-> this (.getData))))

(defn to-object
  "Returns the contents of the document converted to a POJO.

  value-type - The Java class to create - `java.lang.Class`

  returns: The contents of the document in an object of type T - `<T> T`"
  ([^QueryDocumentSnapshot this ^java.lang.Class value-type]
    (-> this (.toObject value-type))))

