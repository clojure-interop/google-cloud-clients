(ns com.google.cloud.datastore.DatastoreException
  "Datastore service exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore DatastoreException]))

(defn ->datastore-exception
  "Constructor.

  code - `int`
  message - `java.lang.String`
  reason - `java.lang.String`
  idempotent - `boolean`
  cause - `java.lang.Throwable`"
  (^DatastoreException [^Integer code ^java.lang.String message ^java.lang.String reason ^Boolean idempotent ^java.lang.Throwable cause]
    (new DatastoreException code message reason idempotent cause))
  (^DatastoreException [^Integer code ^java.lang.String message ^java.lang.String reason ^java.lang.Throwable cause]
    (new DatastoreException code message reason cause))
  (^DatastoreException [^Integer code ^java.lang.String message ^java.lang.String reason]
    (new DatastoreException code message reason))
  (^DatastoreException [^java.io.IOException exception]
    (new DatastoreException exception)))

