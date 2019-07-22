(ns com.google.cloud.dns.ChangeRequestInfo$Status
  "This enumerates the possible states of a change request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns ChangeRequestInfo$Status]))

(def *-pending
  "Static Constant.

  type: com.google.cloud.dns.ChangeRequestInfo$Status"
  ChangeRequestInfo$Status/PENDING)

(def *-done
  "Static Constant.

  type: com.google.cloud.dns.ChangeRequestInfo$Status"
  ChangeRequestInfo$Status/DONE)

(defn *value-of-strict
  "Get the Status for the given String constant, and throw an exception if the constant is not
   recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.dns.ChangeRequestInfo$Status`"
  (^com.google.cloud.dns.ChangeRequestInfo$Status [^java.lang.String constant]
    (ChangeRequestInfo$Status/valueOfStrict constant)))

(defn *value-of
  "Get the Status for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.dns.ChangeRequestInfo$Status`"
  (^com.google.cloud.dns.ChangeRequestInfo$Status [^java.lang.String constant]
    (ChangeRequestInfo$Status/valueOf constant)))

(defn *values
  "Return the known values for Status.

  returns: `com.google.cloud.dns.ChangeRequestInfo$Status[]`"
  ([]
    (ChangeRequestInfo$Status/values )))

