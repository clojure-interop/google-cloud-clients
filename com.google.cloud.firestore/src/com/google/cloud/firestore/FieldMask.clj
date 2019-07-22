(ns com.google.cloud.firestore.FieldMask
  "A FieldMask can be used to limit the number of fields returned by a `getAll()` call."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore FieldMask]))

(defn *of
  "Creates a FieldMask from the provided field paths.

  field-paths - A list of field paths. - `java.lang.String`

  returns: A FieldMask that describes a subset of fields. - `com.google.cloud.firestore.FieldMask`"
  (^com.google.cloud.firestore.FieldMask [^java.lang.String field-paths]
    (FieldMask/of field-paths)))

