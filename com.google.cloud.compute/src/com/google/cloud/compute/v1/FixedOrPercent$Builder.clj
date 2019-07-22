(ns com.google.cloud.compute.v1.FixedOrPercent$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 FixedOrPercent$Builder]))

(defn set-percent
  "Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for
   80%.

  percent - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.FixedOrPercent$Builder`"
  (^com.google.cloud.compute.v1.FixedOrPercent$Builder [^FixedOrPercent$Builder this ^java.lang.Integer percent]
    (-> this (.setPercent percent))))

(defn get-fixed
  "Specifies a fixed number of VM instances. This must be a positive integer.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^FixedOrPercent$Builder this]
    (-> this (.getFixed))))

(defn set-calculated
  "[Output Only] Absolute value of VM instances calculated based on the specific mode.

   - If the value is fixed, then the calculated value is equal to the fixed value. - If the
   value is a percent, then the calculated value is percent/100 * targetSize. For example,
   the calculated value of a 80% of a managed instance group with 150 instances would be (80/100
   * 150) = 120 VM instances. If there is a remainder, the number is rounded up.

  calculated - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.FixedOrPercent$Builder`"
  (^com.google.cloud.compute.v1.FixedOrPercent$Builder [^FixedOrPercent$Builder this ^java.lang.Integer calculated]
    (-> this (.setCalculated calculated))))

(defn build
  "returns: `com.google.cloud.compute.v1.FixedOrPercent`"
  (^com.google.cloud.compute.v1.FixedOrPercent [^FixedOrPercent$Builder this]
    (-> this (.build))))

(defn get-percent
  "Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for
   80%.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^FixedOrPercent$Builder this]
    (-> this (.getPercent))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.FixedOrPercent`

  returns: `com.google.cloud.compute.v1.FixedOrPercent$Builder`"
  (^com.google.cloud.compute.v1.FixedOrPercent$Builder [^FixedOrPercent$Builder this ^com.google.cloud.compute.v1.FixedOrPercent other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.FixedOrPercent$Builder`"
  (^com.google.cloud.compute.v1.FixedOrPercent$Builder [^FixedOrPercent$Builder this]
    (-> this (.clone))))

(defn get-calculated
  "[Output Only] Absolute value of VM instances calculated based on the specific mode.

   - If the value is fixed, then the calculated value is equal to the fixed value. - If the
   value is a percent, then the calculated value is percent/100 * targetSize. For example,
   the calculated value of a 80% of a managed instance group with 150 instances would be (80/100
   * 150) = 120 VM instances. If there is a remainder, the number is rounded up.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^FixedOrPercent$Builder this]
    (-> this (.getCalculated))))

(defn set-fixed
  "Specifies a fixed number of VM instances. This must be a positive integer.

  fixed - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.FixedOrPercent$Builder`"
  (^com.google.cloud.compute.v1.FixedOrPercent$Builder [^FixedOrPercent$Builder this ^java.lang.Integer fixed]
    (-> this (.setFixed fixed))))

