(ns com.google.cloud.compute.v1.stub.HttpJsonLicenseCodeStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonLicenseCodeStub]))

(def *-get-license-code-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetLicenseCodeHttpRequest,com.google.cloud.compute.v1.LicenseCode>"
  HttpJsonLicenseCodeStub/getLicenseCodeMethodDescriptor)

(def *-test-iam-permissions-license-code-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsLicenseCodeHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonLicenseCodeStub/testIamPermissionsLicenseCodeMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonLicenseCodeStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonLicenseCodeStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonLicenseCodeStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonLicenseCodeStub [^com.google.cloud.compute.v1.stub.LicenseCodeStubSettings settings]
    (HttpJsonLicenseCodeStub/create settings)))

(defn get-license-code-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetLicenseCodeHttpRequest,com.google.cloud.compute.v1.LicenseCode>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonLicenseCodeStub this]
    (-> this (.getLicenseCodeCallable))))

(defn test-iam-permissions-license-code-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsLicenseCodeHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonLicenseCodeStub this]
    (-> this (.testIamPermissionsLicenseCodeCallable))))

(defn close
  ""
  ([^HttpJsonLicenseCodeStub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^HttpJsonLicenseCodeStub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonLicenseCodeStub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonLicenseCodeStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonLicenseCodeStub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonLicenseCodeStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

