(ns com.google.cloud.firestore.DocumentReference
  "A DocumentReference refers to a document location in a Firestore database and can be used to
  write, read, or listen to the location. There may or may not exist a document at the referenced
  location. A DocumentReference can also be used to create a CollectionReference to a
  subcollection.

  Subclassing Note: Firestore classes are not meant to be subclassed except for use in
  test mocks. Subclassing is not supported in production code and new SDK releases may break code
  that does so."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore DocumentReference]))

(defn get-collections
  "Deprecated. Use `listCollections()`.

  returns: An Iterable that can be used to fetch all subcollections. - `java.lang.Iterable<com.google.cloud.firestore.CollectionReference>`

  throws: com.google.cloud.firestore.FirestoreException - if the Iterable could not be initialized."
  (^java.lang.Iterable [^DocumentReference this]
    (-> this (.getCollections))))

(defn get-firestore
  "returns: `com.google.cloud.firestore.Firestore`"
  (^com.google.cloud.firestore.Firestore [^DocumentReference this]
    (-> this (.getFirestore))))

(defn delete
  "Deletes the document referred to by this DocumentReference.

  options - Preconditions to enforce for this delete. - `com.google.cloud.firestore.Precondition`

  returns: An ApiFuture that will be resolved when the delete completes. - `com.google.api.core.ApiFuture<com.google.cloud.firestore.WriteResult>`"
  (^com.google.api.core.ApiFuture [^DocumentReference this ^com.google.cloud.firestore.Precondition options]
    (-> this (.delete options)))
  (^com.google.api.core.ApiFuture [^DocumentReference this]
    (-> this (.delete))))

(defn collection
  "Gets a CollectionReference instance that refers to the collection that is a child of this
   document.

  collection-path - A relative and slash-separated path to a collection. - `java.lang.String`

  returns: The CollectionReference instance. - `com.google.cloud.firestore.CollectionReference`"
  (^com.google.cloud.firestore.CollectionReference [^DocumentReference this ^java.lang.String collection-path]
    (-> this (.collection collection-path))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DocumentReference this]
    (-> this (.toString))))

(defn update
  "Updates the fields in the document referred to by this DocumentReference. If the document
   doesn't exist yet, the update will fail.

  options - Preconditions to enforce on this update. - `com.google.cloud.firestore.Precondition`
  field - The first field to set - `java.lang.String`
  value - The first value to set - `java.lang.Object`
  more-fields-and-values - String and Object pairs with more fields to be set. - `java.lang.Object`

  returns: A ApiFuture that will be resolved when the write finishes. - `com.google.api.core.ApiFuture<com.google.cloud.firestore.WriteResult>`"
  (^com.google.api.core.ApiFuture [^DocumentReference this ^com.google.cloud.firestore.Precondition options ^java.lang.String field ^java.lang.Object value ^java.lang.Object more-fields-and-values]
    (-> this (.update options field value more-fields-and-values)))
  (^com.google.api.core.ApiFuture [^DocumentReference this ^java.lang.String field ^java.lang.Object value ^java.lang.Object more-fields-and-values]
    (-> this (.update field value more-fields-and-values)))
  (^com.google.api.core.ApiFuture [^DocumentReference this ^java.util.Map fields ^com.google.cloud.firestore.Precondition options]
    (-> this (.update fields options)))
  (^com.google.api.core.ApiFuture [^DocumentReference this ^java.util.Map fields]
    (-> this (.update fields))))

(defn get-path
  "A string representing the path of the referenced document (relative to the root of the
   database).

  returns: The slash-separated path relative to the root of the database. - `java.lang.String`"
  (^java.lang.String [^DocumentReference this]
    (-> this (.getPath))))

(defn get-parent
  "A reference to the Collection to which this DocumentReference belongs to.

  returns: The parent Collection. - `com.google.cloud.firestore.CollectionReference`"
  (^com.google.cloud.firestore.CollectionReference [^DocumentReference this]
    (-> this (.getParent))))

(defn get-id
  "The id of a document refers to the last component of path pointing to a document, e.g.
   \"document-id\" in \"projects/project-id/databases/database-id/document-id\".

  returns: The ID of the document. - `java.lang.String`"
  (^java.lang.String [^DocumentReference this]
    (-> this (.getId))))

(defn list-collections
  "Fetches the subcollections that are direct children of this document.

  returns: An Iterable that can be used to fetch all subcollections. - `java.lang.Iterable<com.google.cloud.firestore.CollectionReference>`

  throws: com.google.cloud.firestore.FirestoreException - if the Iterable could not be initialized."
  (^java.lang.Iterable [^DocumentReference this]
    (-> this (.listCollections))))

(defn create
  "Creates a new Document at the DocumentReference's Location. It fails the write if the document
   exists.

  fields - A map of the fields and values for the document. - `java.util.Map`

  returns: An ApiFuture that will be resolved when the write finishes. - `com.google.api.core.ApiFuture<com.google.cloud.firestore.WriteResult>`"
  (^com.google.api.core.ApiFuture [^DocumentReference this ^java.util.Map fields]
    (-> this (.create fields))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DocumentReference this]
    (-> this (.hashCode))))

(defn set
  "Writes to the document referred to by this DocumentReference. If the document does not yet
   exist, it will be created. If you pass SetOptions, the provided data can be merged into
   an existing document.

  fields - A map of the fields and values for the document. - `java.util.Map`
  options - An object to configure the set behavior. - `com.google.cloud.firestore.SetOptions`

  returns: An ApiFuture that will be resolved when the write finishes. - `com.google.api.core.ApiFuture<com.google.cloud.firestore.WriteResult>`"
  (^com.google.api.core.ApiFuture [^DocumentReference this ^java.util.Map fields ^com.google.cloud.firestore.SetOptions options]
    (-> this (.set fields options)))
  (^com.google.api.core.ApiFuture [^DocumentReference this ^java.util.Map fields]
    (-> this (.set fields))))

(defn add-snapshot-listener
  "Starts listening to the document referenced by this DocumentReference.

  executor - The executor to use to call the listener. - `java.util.concurrent.Executor`
  listener - The event listener that will be called with the snapshots. - `com.google.cloud.firestore.EventListener`

  returns: A registration object that can be used to remove the listener. - `com.google.cloud.firestore.ListenerRegistration`"
  (^com.google.cloud.firestore.ListenerRegistration [^DocumentReference this ^java.util.concurrent.Executor executor ^com.google.cloud.firestore.EventListener listener]
    (-> this (.addSnapshotListener executor listener)))
  (^com.google.cloud.firestore.ListenerRegistration [^DocumentReference this ^com.google.cloud.firestore.EventListener listener]
    (-> this (.addSnapshotListener listener))))

(defn get
  "Reads the document referenced by this DocumentReference. If the document doesn't exist, the
   get() will return an an empty DocumentSnapshot.

  returns: An ApiFuture that will be resolved with the contents of the Document at this
       DocumentReference, or a failure if the document does not exist. - `com.google.api.core.ApiFuture<com.google.cloud.firestore.DocumentSnapshot>`"
  (^com.google.api.core.ApiFuture [^DocumentReference this]
    (-> this (.get))))

(defn equals
  "Returns true if this DocumentReference is equal to the provided object.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this DocumentReference is equal to the provided object. - `boolean`"
  (^Boolean [^DocumentReference this ^java.lang.Object obj]
    (-> this (.equals obj))))

