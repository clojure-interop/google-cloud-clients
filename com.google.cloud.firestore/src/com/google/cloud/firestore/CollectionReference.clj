(ns com.google.cloud.firestore.CollectionReference
  "A CollectionReference can be used for adding documents, getting document references, and querying
  for documents (using the methods inherited from Query).

  Subclassing Note: Firestore classes are not meant to be subclassed except for use in
  test mocks. Subclassing is not supported in production code and new SDK releases may break code
  that does so."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore CollectionReference]))

(defn get-id
  "The id of a collection refers to the last component of path pointing to a collection, e.g.
   \"collection-id\" in \"projects/project-id/databases/database-id/documents/collection-id\".

  returns: The ID of the collection. - `java.lang.String`"
  (^java.lang.String [^CollectionReference this]
    (-> this (.getId))))

(defn get-parent
  "Returns a DocumentReference to the containing Document if this is a subcollection, else null.

  returns: A DocumentReference pointing to the parent document. - `com.google.cloud.firestore.DocumentReference`"
  (^com.google.cloud.firestore.DocumentReference [^CollectionReference this]
    (-> this (.getParent))))

(defn get-path
  "A string representing the path of the referenced collection (relative to the root of the
   database).

  returns: The slash-separated path relative to the root of the database. - `java.lang.String`"
  (^java.lang.String [^CollectionReference this]
    (-> this (.getPath))))

(defn document
  "Gets a DocumentReference instance that refers to the document that is a child of this
   Collection.

  child-path - A relative and slash-separated path to a document. - `java.lang.String`

  returns: The DocumentReference instance. - `com.google.cloud.firestore.DocumentReference`"
  (^com.google.cloud.firestore.DocumentReference [^CollectionReference this ^java.lang.String child-path]
    (-> this (.document child-path)))
  (^com.google.cloud.firestore.DocumentReference [^CollectionReference this]
    (-> this (.document))))

(defn list-documents
  "Retrieves the list of documents in this collection.

   The document references returned may include references to \"missing documents\", i.e.
   document locations that have no document present but which contain subcollections with
   documents. Attempting to read such a document reference (e.g. via `get()` or `onSnapshot()`)
   will return a `DocumentSnapshot` whose `exists()` method returns false.

  returns: The list of documents in this collection. - `java.lang.Iterable<com.google.cloud.firestore.DocumentReference>`"
  (^java.lang.Iterable [^CollectionReference this]
    (-> this (.listDocuments))))

(defn add
  "Adds a new document to this collection with the specified data, assigning it a document ID
   automatically.

  fields - A Map containing the data for the new document. - `java.util.Map`

  returns: An ApiFuture that will be resolved with the DocumentReference of the newly created
       document. - `com.google.api.core.ApiFuture<com.google.cloud.firestore.DocumentReference>`"
  (^com.google.api.core.ApiFuture [^CollectionReference this ^java.util.Map fields]
    (-> this (.add fields))))

