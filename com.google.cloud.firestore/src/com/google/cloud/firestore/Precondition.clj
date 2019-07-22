(ns com.google.cloud.firestore.Precondition
  "Preconditions that can be used to restrict update() calls."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore Precondition]))

(def *-none
  "Static Constant.

  An empty Precondition that adds no enforcements

  type: com.google.cloud.firestore.Precondition"
  Precondition/NONE)

(defn *updated-at
  "Creates a Precondition that enforces that the existing document was written at the specified
   time.

  update-time - The write time to enforce on the existing document. - `com.google.cloud.Timestamp`

  returns: A new Precondition - `com.google.cloud.firestore.Precondition`"
  (^com.google.cloud.firestore.Precondition [^com.google.cloud.Timestamp update-time]
    (Precondition/updatedAt update-time)))

(defn equals
  "Returns true if this Precondition is equal to the provided object.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this Precondition is equal to the provided object. - `boolean`"
  (^Boolean [^Precondition this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Precondition this]
    (-> this (.hashCode))))

