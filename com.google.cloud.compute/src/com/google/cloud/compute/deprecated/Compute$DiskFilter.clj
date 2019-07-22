(ns com.google.cloud.compute.deprecated.Compute$DiskFilter
  "Class for filtering disk lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$DiskFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$DiskField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskFilter`"
  (^com.google.cloud.compute.deprecated.Compute$DiskFilter [^com.google.cloud.compute.deprecated.Compute$DiskField field ^java.lang.String value]
    (Compute$DiskFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$DiskField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskFilter`"
  (^com.google.cloud.compute.deprecated.Compute$DiskFilter [^com.google.cloud.compute.deprecated.Compute$DiskField field ^java.lang.String value]
    (Compute$DiskFilter/notEquals field value)))

