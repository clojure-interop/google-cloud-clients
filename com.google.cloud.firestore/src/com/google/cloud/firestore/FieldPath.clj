(ns com.google.cloud.firestore.FieldPath
  "A FieldPath refers to a field in a document. The path may consist of a single field name
  (referring to a top level field in the document), or a list of field names (referring to a nested
  field in the document)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore FieldPath]))

(defn ->field-path
  "Constructor."
  (^FieldPath []
    (new FieldPath )))

(defn *of
  "Creates a FieldPath from the provided field names. If more than one field name is provided, the
   path will point to a nested field in a document.

  field-names - A list of field names. - `java.lang.String`

  returns: A FieldPath that points to a field location in a document. - `com.google.cloud.firestore.FieldPath`"
  (^com.google.cloud.firestore.FieldPath [^java.lang.String field-names]
    (FieldPath/of field-names)))

(defn *document-id
  "A special sentinel to refer to the ID of a document. It can be used in queries to sort or
   filter by the document ID.

  returns: `com.google.cloud.firestore.FieldPath`"
  (^com.google.cloud.firestore.FieldPath []
    (FieldPath/documentId )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FieldPath this]
    (-> this (.toString))))

