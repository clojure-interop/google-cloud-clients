(ns com.google.cloud.firestore.UpdateBuilder
  "Abstract class that collects and bundles all write operations for Transaction and WriteBatch."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore UpdateBuilder]))

(defn create
  "Creates a new Document at the DocumentReference's location. It fails the write if the document
   exists.

  document-reference - The DocumentReference to create. - `com.google.cloud.firestore.DocumentReference`
  fields - A map of the fields and values for the document. - `java.util.Map`

  returns: The instance for chaining. - `T`"
  ([^UpdateBuilder this ^com.google.cloud.firestore.DocumentReference document-reference ^java.util.Map fields]
    (-> this (.create document-reference fields))))

(defn set
  "Overwrites the document referred to by this DocumentReference. If the document doesn't exist
   yet, it will be created. If you pass SetOptions, the provided data can be merged into
   an existing document.

  document-reference - The DocumentReference to overwrite. - `com.google.cloud.firestore.DocumentReference`
  fields - A map of the field paths and values for the document. - `java.util.Map`
  options - An object to configure the set behavior. - `com.google.cloud.firestore.SetOptions`

  returns: The instance for chaining. - `T`"
  ([^UpdateBuilder this ^com.google.cloud.firestore.DocumentReference document-reference ^java.util.Map fields ^com.google.cloud.firestore.SetOptions options]
    (-> this (.set document-reference fields options)))
  ([^UpdateBuilder this ^com.google.cloud.firestore.DocumentReference document-reference ^java.util.Map fields]
    (-> this (.set document-reference fields))))

(defn update
  "Updates the fields in the document referred to by this DocumentReference. If the document
   doesn't exist yet, the update will fail.

  document-reference - The DocumentReference to update. - `com.google.cloud.firestore.DocumentReference`
  options - Preconditions to enforce on this update. - `com.google.cloud.firestore.Precondition`
  field - The first field to set. - `java.lang.String`
  value - The first value to set. - `java.lang.Object`
  more-fields-and-values - String and Object pairs with more fields to be set. - `java.lang.Object`

  returns: The instance for chaining. - `T`"
  ([^UpdateBuilder this ^com.google.cloud.firestore.DocumentReference document-reference ^com.google.cloud.firestore.Precondition options ^java.lang.String field ^java.lang.Object value ^java.lang.Object more-fields-and-values]
    (-> this (.update document-reference options field value more-fields-and-values)))
  ([^UpdateBuilder this ^com.google.cloud.firestore.DocumentReference document-reference ^java.lang.String field ^java.lang.Object value ^java.lang.Object more-fields-and-values]
    (-> this (.update document-reference field value more-fields-and-values)))
  ([^UpdateBuilder this ^com.google.cloud.firestore.DocumentReference document-reference ^java.util.Map fields ^com.google.cloud.firestore.Precondition options]
    (-> this (.update document-reference fields options)))
  ([^UpdateBuilder this ^com.google.cloud.firestore.DocumentReference document-reference ^java.util.Map fields]
    (-> this (.update document-reference fields))))

(defn delete
  "Deletes the document referred to by this DocumentReference.

  document-reference - The DocumentReference to delete. - `com.google.cloud.firestore.DocumentReference`
  precondition - Precondition for the delete operation. - `com.google.cloud.firestore.Precondition`

  returns: The instance for chaining. - `T`"
  ([^UpdateBuilder this ^com.google.cloud.firestore.DocumentReference document-reference ^com.google.cloud.firestore.Precondition precondition]
    (-> this (.delete document-reference precondition)))
  ([^UpdateBuilder this ^com.google.cloud.firestore.DocumentReference document-reference]
    (-> this (.delete document-reference))))

(defn get-mutations-size
  "Get the number of mutations.

  returns: `int`"
  (^Integer [^UpdateBuilder this]
    (-> this (.getMutationsSize))))

