(ns com.google.cloud.compute.v1.stub.LicenseCodeStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub LicenseCodeStub]))

(defn ->license-code-stub
  "Constructor."
  (^LicenseCodeStub []
    (new LicenseCodeStub )))

(defn get-license-code-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetLicenseCodeHttpRequest,com.google.cloud.compute.v1.LicenseCode>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseCodeStub this]
    (-> this (.getLicenseCodeCallable))))

(defn test-iam-permissions-license-code-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsLicenseCodeHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseCodeStub this]
    (-> this (.testIamPermissionsLicenseCodeCallable))))

(defn close
  ""
  ([^LicenseCodeStub this]
    (-> this (.close))))

