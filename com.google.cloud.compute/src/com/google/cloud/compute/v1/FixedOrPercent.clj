(ns com.google.cloud.compute.v1.FixedOrPercent
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 FixedOrPercent]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.FixedOrPercent`

  returns: `com.google.cloud.compute.v1.FixedOrPercent$Builder`"
  (^com.google.cloud.compute.v1.FixedOrPercent$Builder [^com.google.cloud.compute.v1.FixedOrPercent prototype]
    (FixedOrPercent/newBuilder prototype))
  (^com.google.cloud.compute.v1.FixedOrPercent$Builder []
    (FixedOrPercent/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.FixedOrPercent`"
  (^com.google.cloud.compute.v1.FixedOrPercent []
    (FixedOrPercent/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^FixedOrPercent this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FixedOrPercent this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^FixedOrPercent this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-fixed
  "Specifies a fixed number of VM instances. This must be a positive integer.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^FixedOrPercent this]
    (-> this (.getFixed))))

(defn get-percent
  "Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for
   80%.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^FixedOrPercent this]
    (-> this (.getPercent))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^FixedOrPercent this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^FixedOrPercent this]
    (-> this (.hashCode))))

(defn get-calculated
  "[Output Only] Absolute value of VM instances calculated based on the specific mode.

   - If the value is fixed, then the calculated value is equal to the fixed value. - If the
   value is a percent, then the calculated value is percent/100 * targetSize. For example, the
   calculated value of a 80% of a managed instance group with 150 instances would be (80/100 *
   150) = 120 VM instances. If there is a remainder, the number is rounded up.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^FixedOrPercent this]
    (-> this (.getCalculated))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FixedOrPercent this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.FixedOrPercent$Builder`"
  (^com.google.cloud.compute.v1.FixedOrPercent$Builder [^FixedOrPercent this]
    (-> this (.toBuilder))))

