(ns com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolsRemoveHealthCheckRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest`

  returns: `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder [^TargetPoolsRemoveHealthCheckRequest$Builder this ^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest other]
    (-> this (.mergeFrom other))))

(defn get-health-checks-list
  "Health check URL to be removed. This can be a full or valid partial URL. For example, the
   following are valid URLs: -
   https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
   - projects/project/global/httpHealthChecks/health-check -
   global/httpHealthChecks/health-check

  returns: `java.util.List<com.google.cloud.compute.v1.HealthCheckReference>`"
  (^java.util.List [^TargetPoolsRemoveHealthCheckRequest$Builder this]
    (-> this (.getHealthChecksList))))

(defn add-all-health-checks
  "Health check URL to be removed. This can be a full or valid partial URL. For example, the
   following are valid URLs: -
   https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
   - projects/project/global/httpHealthChecks/health-check -
   global/httpHealthChecks/health-check

  health-checks - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder [^TargetPoolsRemoveHealthCheckRequest$Builder this ^java.util.List health-checks]
    (-> this (.addAllHealthChecks health-checks))))

(defn add-health-checks
  "Health check URL to be removed. This can be a full or valid partial URL. For example, the
   following are valid URLs: -
   https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
   - projects/project/global/httpHealthChecks/health-check -
   global/httpHealthChecks/health-check

  health-checks - `com.google.cloud.compute.v1.HealthCheckReference`

  returns: `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder [^TargetPoolsRemoveHealthCheckRequest$Builder this ^com.google.cloud.compute.v1.HealthCheckReference health-checks]
    (-> this (.addHealthChecks health-checks))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest [^TargetPoolsRemoveHealthCheckRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder [^TargetPoolsRemoveHealthCheckRequest$Builder this]
    (-> this (.clone))))

