(ns com.google.cloud.compute.deprecated.Compute$DiskTypeFilter
  "Class for filtering disk type lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$DiskTypeFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$DiskTypeField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskTypeFilter`"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeFilter [^com.google.cloud.compute.deprecated.Compute$DiskTypeField field ^java.lang.String value]
    (Compute$DiskTypeFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$DiskTypeField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskTypeFilter`"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeFilter [^com.google.cloud.compute.deprecated.Compute$DiskTypeField field ^java.lang.String value]
    (Compute$DiskTypeFilter/notEquals field value)))

