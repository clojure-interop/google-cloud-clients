(ns com.google.cloud.compute.v1.stub.HttpJsonImageStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonImageStub]))

(def *-delete-image-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteImageHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonImageStub/deleteImageMethodDescriptor)

(def *-deprecate-image-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeprecateImageHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonImageStub/deprecateImageMethodDescriptor)

(def *-get-image-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetImageHttpRequest,com.google.cloud.compute.v1.Image>"
  HttpJsonImageStub/getImageMethodDescriptor)

(def *-get-from-family-image-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetFromFamilyImageHttpRequest,com.google.cloud.compute.v1.Image>"
  HttpJsonImageStub/getFromFamilyImageMethodDescriptor)

(def *-get-iam-policy-image-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonImageStub/getIamPolicyImageMethodDescriptor)

(def *-insert-image-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertImageHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonImageStub/insertImageMethodDescriptor)

(def *-list-images-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListImagesHttpRequest,com.google.cloud.compute.v1.ImageList>"
  HttpJsonImageStub/listImagesMethodDescriptor)

(def *-set-iam-policy-image-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonImageStub/setIamPolicyImageMethodDescriptor)

(def *-set-labels-image-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetLabelsImageHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonImageStub/setLabelsImageMethodDescriptor)

(def *-test-iam-permissions-image-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsImageHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonImageStub/testIamPermissionsImageMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonImageStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonImageStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonImageStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonImageStub [^com.google.cloud.compute.v1.stub.ImageStubSettings settings]
    (HttpJsonImageStub/create settings)))

(defn deprecate-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeprecateImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.deprecateImageCallable))))

(defn list-images-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListImagesHttpRequest,com.google.cloud.compute.v1.ImageClient$ListImagesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.listImagesPagedCallable))))

(defn test-iam-permissions-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsImageHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.testIamPermissionsImageCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonImageStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonImageStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonImageStub this]
    (-> this (.shutdown))))

(defn set-labels-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.setLabelsImageCallable))))

(defn get-from-family-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetFromFamilyImageHttpRequest,com.google.cloud.compute.v1.Image>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.getFromFamilyImageCallable))))

(defn insert-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.insertImageCallable))))

(defn close
  ""
  ([^HttpJsonImageStub this]
    (-> this (.close))))

(defn list-images-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListImagesHttpRequest,com.google.cloud.compute.v1.ImageList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.listImagesCallable))))

(defn set-iam-policy-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.setIamPolicyImageCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonImageStub this]
    (-> this (.isTerminated))))

(defn delete-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.deleteImageCallable))))

(defn get-iam-policy-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.getIamPolicyImageCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonImageStub this]
    (-> this (.shutdownNow))))

(defn get-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetImageHttpRequest,com.google.cloud.compute.v1.Image>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonImageStub this]
    (-> this (.getImageCallable))))

