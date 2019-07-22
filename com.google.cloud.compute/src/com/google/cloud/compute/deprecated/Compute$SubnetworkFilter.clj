(ns com.google.cloud.compute.deprecated.Compute$SubnetworkFilter
  "Class for filtering subnetwork lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$SubnetworkFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$SubnetworkField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$SubnetworkFilter`"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkFilter [^com.google.cloud.compute.deprecated.Compute$SubnetworkField field ^java.lang.String value]
    (Compute$SubnetworkFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$SubnetworkField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$SubnetworkFilter`"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkFilter [^com.google.cloud.compute.deprecated.Compute$SubnetworkField field ^java.lang.String value]
    (Compute$SubnetworkFilter/notEquals field value)))

