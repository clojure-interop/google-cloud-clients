(ns com.google.cloud.firestore.FieldValue
  "Sentinel values that can be used when writing document fields with set() or update()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore FieldValue]))

(defn *server-timestamp
  "Returns a sentinel used with set() or update() to include a server-generated timestamp in the
   written data.

  returns: `com.google.cloud.firestore.FieldValue`"
  (^com.google.cloud.firestore.FieldValue []
    (FieldValue/serverTimestamp )))

(defn *delete
  "Returns a sentinel used with update() to mark a field for deletion.

  returns: `com.google.cloud.firestore.FieldValue`"
  (^com.google.cloud.firestore.FieldValue []
    (FieldValue/delete )))

(defn *increment
  "Returns a special value that can be used with set(), create() or update() that tells the server
   to increment the field's current value by the given value.

   If the current field value is an integer, possible integer overflows are resolved to
   Long.MAX_VALUE or Long.MIN_VALUE. If the current field value is a double, both values will be
   interpreted as doubles and the arithmetic will follow IEEE 754 semantics.

   If the current field is not an integer or double, or if the field does not yet exist, the
   transformation will set the field to the given value.

  l - `long`

  returns: The FieldValue sentinel for use in a call to set(), create() or update(). - `com.google.cloud.firestore.FieldValue`"
  (^com.google.cloud.firestore.FieldValue [^Long l]
    (FieldValue/increment l)))

(defn *array-union
  "Returns a special value that can be used with set(), create() or update() that tells the server
   to union the given elements with any array value that already exists on the server. Each
   specified element that doesn't already exist in the array will be added to the end. If the
   field being modified is not already an array it will be overwritten with an array containing
   exactly the specified elements.

  elements - The elements to union into the array. - `java.lang.Object`

  returns: The FieldValue sentinel for use in a call to set() or update(). - `com.google.cloud.firestore.FieldValue`"
  (^com.google.cloud.firestore.FieldValue [^java.lang.Object elements]
    (FieldValue/arrayUnion elements)))

(defn *array-remove
  "Returns a special value that can be used with set(), create() or update() that tells the server
   to remove the given elements from any array value that already exists on the server. All
   instances of each element specified will be removed from the array. If the field being modified
   is not already an array it will be overwritten with an empty array.

  elements - The elements to remove from the array. - `java.lang.Object`

  returns: The FieldValue sentinel for use in a call to set() or update(). - `com.google.cloud.firestore.FieldValue`"
  (^com.google.cloud.firestore.FieldValue [^java.lang.Object elements]
    (FieldValue/arrayRemove elements)))

(defn equals
  "Returns true if this FieldValue is equal to the provided object.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this FieldValue is equal to the provided object. - `boolean`"
  (^Boolean [^FieldValue this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^FieldValue this]
    (-> this (.hashCode))))

