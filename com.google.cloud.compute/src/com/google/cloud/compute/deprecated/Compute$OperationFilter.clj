(ns com.google.cloud.compute.deprecated.Compute$OperationFilter
  "Class for filtering operation lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$OperationFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$OperationField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$OperationFilter`"
  (^com.google.cloud.compute.deprecated.Compute$OperationFilter [^com.google.cloud.compute.deprecated.Compute$OperationField field ^java.lang.String value]
    (Compute$OperationFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$OperationField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$OperationFilter`"
  (^com.google.cloud.compute.deprecated.Compute$OperationFilter [^com.google.cloud.compute.deprecated.Compute$OperationField field ^java.lang.String value]
    (Compute$OperationFilter/notEquals field value)))

