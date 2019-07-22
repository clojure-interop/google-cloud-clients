(ns com.google.cloud.firestore.Firestore
  "Represents a Firestore Database and is the entry point for all Firestore operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore Firestore]))

(defn collection-group
  "Creates and returns a new @link{Query} that includes all documents in the database that are
   contained in a collection or subcollection with the given @code{collectionId}.

  collection-id - Identifies the collections to query over. Every collection or subcollection with this ID as the last segment of its path will be included. Cannot contain a slash. - `java.lang.String`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Firestore this ^java.lang.String collection-id]
    (-> this (.collectionGroup collection-id))))

(defn get-collections
  "Deprecated. Use `listCollections()`.

  returns: An Iterable that can be used to fetch all collections. - `java.lang.Iterable<com.google.cloud.firestore.CollectionReference>`

  throws: com.google.cloud.firestore.FirestoreException - if the Iterable could not be initialized."
  (^java.lang.Iterable [^Firestore this]
    (-> this (.getCollections))))

(defn collection
  "Gets a CollectionReference that refers to the collection at the specified path.

  path - A slash-separated path to a collection. - `java.lang.String`

  returns: The CollectionReference instance. - `com.google.cloud.firestore.CollectionReference`"
  (^com.google.cloud.firestore.CollectionReference [^Firestore this ^java.lang.String path]
    (-> this (.collection path))))

(defn get-all
  "Retrieves multiple documents from Firestore, while optionally applying a field mask to reduce
   the amount of data transmitted.

  document-references - Array with Document References to fetch. - `com.google.cloud.firestore.DocumentReference[]`
  field-mask - If set, specifies the subset of fields to return. - `com.google.cloud.firestore.FieldMask`

  returns: `com.google.api.core.ApiFuture<java.util.List<com.google.cloud.firestore.DocumentSnapshot>>`"
  (^com.google.api.core.ApiFuture [^Firestore this document-references ^com.google.cloud.firestore.FieldMask field-mask]
    (-> this (.getAll document-references field-mask)))
  (^com.google.api.core.ApiFuture [^Firestore this ^com.google.cloud.firestore.DocumentReference document-references]
    (-> this (.getAll document-references))))

(defn batch
  "Gets a Firestore WriteBatch instance that can be used to combine multiple writes.

  returns: A WriteBatch that operates on this Firestore client. - `com.google.cloud.firestore.WriteBatch`"
  (^com.google.cloud.firestore.WriteBatch [^Firestore this]
    (-> this (.batch))))

(defn document
  "Gets a DocumentReference that refers to the document at the specified path.

  path - A slash-separated path to a document. - `java.lang.String`

  returns: The DocumentReference instance. - `com.google.cloud.firestore.DocumentReference`"
  (^com.google.cloud.firestore.DocumentReference [^Firestore this ^java.lang.String path]
    (-> this (.document path))))

(defn run-transaction
  "Executes the given updateFunction and then attempts to commit the changes applied within the
   transaction. If any document read within the transaction has changed, the updateFunction will
   be retried. If it fails to commit after the maxmimum number of attemps specified in
   transactionOptions, the transaction will fail.

  update-function - The function to execute within the transaction context. - `com.google.cloud.firestore.Transaction$Function`
  transaction-options - `com.google.cloud.firestore.TransactionOptions`

  returns: An ApiFuture that will be resolved with the result from updateFunction. - `<T> com.google.api.core.ApiFuture<T>`"
  ([^Firestore this ^com.google.cloud.firestore.Transaction$Function update-function ^com.google.cloud.firestore.TransactionOptions transaction-options]
    (-> this (.runTransaction update-function transaction-options)))
  ([^Firestore this ^com.google.cloud.firestore.Transaction$Function update-function]
    (-> this (.runTransaction update-function))))

(defn close
  "Closes the gRPC channels associated with this instance and frees up their resources. This
   method blocks until all channels are closed. Once this method is called, this Firestore client
   is no longer usable.

  throws: java.lang.Exception"
  ([^Firestore this]
    (-> this (.close))))

(defn list-collections
  "Fetches the root collections that are associated with this Firestore database.

  returns: An Iterable that can be used to fetch all collections. - `java.lang.Iterable<com.google.cloud.firestore.CollectionReference>`

  throws: com.google.cloud.firestore.FirestoreException - if the Iterable could not be initialized."
  (^java.lang.Iterable [^Firestore this]
    (-> this (.listCollections))))

