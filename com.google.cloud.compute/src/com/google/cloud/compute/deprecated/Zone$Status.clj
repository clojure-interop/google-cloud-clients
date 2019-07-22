(ns com.google.cloud.compute.deprecated.Zone$Status
  "Status of the region."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Zone$Status]))

(def *-up
  "Static Constant.

  type: com.google.cloud.compute.deprecated.Zone$Status"
  Zone$Status/UP)

(def *-down
  "Static Constant.

  type: com.google.cloud.compute.deprecated.Zone$Status"
  Zone$Status/DOWN)

(defn *value-of-strict
  "Get the Status for the given String constant, and throw an exception if the constant is not
   recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Zone$Status`"
  (^com.google.cloud.compute.deprecated.Zone$Status [^java.lang.String constant]
    (Zone$Status/valueOfStrict constant)))

(defn *value-of
  "Get the Status for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Zone$Status`"
  (^com.google.cloud.compute.deprecated.Zone$Status [^java.lang.String constant]
    (Zone$Status/valueOf constant)))

(defn *values
  "Return the known values for Status.

  returns: `com.google.cloud.compute.deprecated.Zone$Status[]`"
  ([]
    (Zone$Status/values )))

