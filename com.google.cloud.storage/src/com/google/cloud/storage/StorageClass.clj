(ns com.google.cloud.storage.StorageClass
  "Enums for the storage classes. See https://cloud.google.com/storage/docs/storage-classes for
  details."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage StorageClass]))

(def *-regional
  "Static Constant.

  Regional storage class.

  type: com.google.cloud.storage.StorageClass"
  StorageClass/REGIONAL)

(def *-multi-regional
  "Static Constant.

  Multi-regional storage class.

  type: com.google.cloud.storage.StorageClass"
  StorageClass/MULTI_REGIONAL)

(def *-nearline
  "Static Constant.

  Nearline storage class.

  type: com.google.cloud.storage.StorageClass"
  StorageClass/NEARLINE)

(def *-coldline
  "Static Constant.

  Coldline storage class.

  type: com.google.cloud.storage.StorageClass"
  StorageClass/COLDLINE)

(def *-standard
  "Static Constant.

  Standard storage class.

  type: com.google.cloud.storage.StorageClass"
  StorageClass/STANDARD)

(def *-durable-reduced-availability
  "Static Constant.

  Durable Reduced Availability (deprecated)

  type: com.google.cloud.storage.StorageClass"
  StorageClass/DURABLE_REDUCED_AVAILABILITY)

(defn *value-of-strict
  "Get the StorageClass for the given String constant, and throw an exception if the constant is
   not recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.storage.StorageClass`"
  (^com.google.cloud.storage.StorageClass [^java.lang.String constant]
    (StorageClass/valueOfStrict constant)))

(defn *value-of
  "Get the StorageClass for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.storage.StorageClass`"
  (^com.google.cloud.storage.StorageClass [^java.lang.String constant]
    (StorageClass/valueOf constant)))

(defn *values
  "Return the known values for StorageClass.

  returns: `com.google.cloud.storage.StorageClass[]`"
  ([]
    (StorageClass/values )))

