(ns com.google.cloud.firestore.SetOptions
  "An options object that configures the behavior of set() calls. By providing one of the SetOptions
  objects returned by merge, mergeFields(java.util.List<java.lang.String>) and mergeFieldPaths(java.util.List<com.google.cloud.firestore.FieldPath>), the set()
  calls in DocumentReference, WriteBatch and Transaction can be configured
  to perform granular merges instead of overwriting the target documents in their entirety."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore SetOptions]))

(defn *merge
  "Changes the behavior of set() calls to only replace the values specified in its data argument.
   Fields with no corresponding values in the data passed to set() will remain untouched.

  returns: `com.google.cloud.firestore.SetOptions`"
  (^com.google.cloud.firestore.SetOptions []
    (SetOptions/merge )))

(defn *merge-fields
  "Changes the behavior of set() calls to only replace the fields under fieldPaths. Any field that
   is not specified in fieldPaths is ignored and remains untouched.

   It is an error to pass a SetOptions object to a set() call that is missing a value for any
   of the fields specified here.

  fields - The list of fields to merge. Fields can contain dots to reference nested fields within the document. - `java.util.List`

  returns: `com.google.cloud.firestore.SetOptions`"
  (^com.google.cloud.firestore.SetOptions [^java.util.List fields]
    (SetOptions/mergeFields fields)))

(defn *merge-field-paths
  "Changes the behavior of set() calls to only replace the fields under fieldPaths. Any field that
   is not specified in fieldPaths is ignored and remains untouched.

   It is an error to pass a SetOptions object to a set() call that is missing a value for any
   of the fields specified here in its to data argument.

  fields - The list of fields to merge. - `java.util.List`

  returns: `com.google.cloud.firestore.SetOptions`"
  (^com.google.cloud.firestore.SetOptions [^java.util.List fields]
    (SetOptions/mergeFieldPaths fields)))

(defn equals
  "Returns true if this SetOptions is equal to the provided object.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this SetOptions is equal to the provided object. - `boolean`"
  (^Boolean [^SetOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SetOptions this]
    (-> this (.hashCode))))

