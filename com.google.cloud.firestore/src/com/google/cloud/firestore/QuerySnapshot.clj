(ns com.google.cloud.firestore.QuerySnapshot
  "A QuerySnapshot contains the results of a query. It can contain zero or more DocumentSnapshot
  objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore QuerySnapshot]))

(defn *with-documents
  "Creates a new QuerySnapshot representing the results of a Query with added documents.

  query - `com.google.cloud.firestore.Query`
  read-time - `com.google.cloud.Timestamp`
  documents - `java.util.List`

  returns: `com.google.cloud.firestore.QuerySnapshot`"
  (^com.google.cloud.firestore.QuerySnapshot [^com.google.cloud.firestore.Query query ^com.google.cloud.Timestamp read-time ^java.util.List documents]
    (QuerySnapshot/withDocuments query read-time documents)))

(defn *with-changes
  "Creates a new QuerySnapshot representing a snapshot of a Query with changed documents.

  query - `com.google.cloud.firestore.Query`
  read-time - `com.google.cloud.Timestamp`
  document-set - `com.google.cloud.firestore.DocumentSet`
  document-changes - `java.util.List`

  returns: `com.google.cloud.firestore.QuerySnapshot`"
  (^com.google.cloud.firestore.QuerySnapshot [^com.google.cloud.firestore.Query query ^com.google.cloud.Timestamp read-time ^com.google.cloud.firestore.DocumentSet document-set ^java.util.List document-changes]
    (QuerySnapshot/withChanges query read-time document-set document-changes)))

(defn get-documents
  "Returns the documents in this QuerySnapshot as a List in order of the query.

  returns: The list of documents. - `java.util.List<com.google.cloud.firestore.QueryDocumentSnapshot>`"
  (^java.util.List [^QuerySnapshot this]
    (-> this (.getDocuments))))

(defn get-document-changes
  "Returns the list of documents that changed since the last snapshot. If it's the first snapshot
   all documents will be in the list as added changes.

  returns: The list of documents that changed since the last snapshot. - `java.util.List<com.google.cloud.firestore.DocumentChange>`"
  (^java.util.List [^QuerySnapshot this]
    (-> this (.getDocumentChanges))))

(defn to-objects
  "Returns the contents of the documents in the QuerySnapshot, converted to the provided class, as
   a list.

  clazz - The POJO type used to convert the documents in the list. - `java.lang.Class`

  returns: `<T> java.util.List<T>`"
  ([^QuerySnapshot this ^java.lang.Class clazz]
    (-> this (.toObjects clazz))))

(defn iterator
  "returns: `java.util.Iterator<com.google.cloud.firestore.QueryDocumentSnapshot>`"
  (^java.util.Iterator [^QuerySnapshot this]
    (-> this (.iterator))))

(defn get-query
  "Returns the query for the snapshot.

  returns: The backing query that produced this snapshot. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^QuerySnapshot this]
    (-> this (.getQuery))))

(defn hash-code
  "returns: `int`"
  (^Integer [^QuerySnapshot this]
    (-> this (.hashCode))))

(defn empty?
  "Returns true if there are no documents in the QuerySnapshot.

  returns: `boolean`"
  (^Boolean [^QuerySnapshot this]
    (-> this (.isEmpty))))

(defn size
  "Returns the number of documents in the QuerySnapshot.

  returns: `int`"
  (^Integer [^QuerySnapshot this]
    (-> this (.size))))

(defn get-read-time
  "Returns the time at which this snapshot was read.

  returns: The read time of this snapshot. - `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^QuerySnapshot this]
    (-> this (.getReadTime))))

(defn equals
  "Returns true if the document data in this QuerySnapshot equals the provided snapshot.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this QuerySnapshot is equal to the provided object. - `boolean`"
  (^Boolean [^QuerySnapshot this ^java.lang.Object obj]
    (-> this (.equals obj))))

