(ns com.google.cloud.automl.v1beta1.AutoMlClient
  "Service Description: AutoML Server API.

  The resource names are assigned by the server. The server never reuses names that it has
  created after the resources with those names are deleted.

  An ID of a resource is the last element of the item's resource name. For
  `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`, then the id for the item
  is `{dataset_id}`.

  Currently the only supported `location_id` is \"us-central1\".

  On any input that is documented to expect a string parameter in snake_case or kebab-case,
  either of those cases is accepted.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (AutoMlClient autoMlClient = AutoMlClient.create()) {
    LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
    Dataset dataset = Dataset.newBuilder().build();
    Dataset response = autoMlClient.createDataset(parent, dataset);
  }

  Note: close() needs to be called on the autoMlClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of AutoMlSettings to create().
  For example:

  To customize credentials:



  AutoMlSettings autoMlSettings =
      AutoMlSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  AutoMlClient autoMlClient =
      AutoMlClient.create(autoMlSettings);

  To customize the endpoint:



  AutoMlSettings autoMlSettings =
      AutoMlSettings.newBuilder().setEndpoint(myEndpoint).build();
  AutoMlClient autoMlClient =
      AutoMlClient.create(autoMlSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1 AutoMlClient]))

(defn *create
  "Constructs an instance of AutoMlClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.automl.v1beta1.AutoMlSettings`

  returns: `com.google.cloud.automl.v1beta1.AutoMlClient`

  throws: java.io.IOException"
  (^com.google.cloud.automl.v1beta1.AutoMlClient [^com.google.cloud.automl.v1beta1.AutoMlSettings settings]
    (AutoMlClient/create settings))
  (^com.google.cloud.automl.v1beta1.AutoMlClient []
    (AutoMlClient/create )))

(defn delete-dataset-async
  "Deletes a dataset and all of its contents. Returns empty response in the
   [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   in the [metadata][google.longrunning.Operation.metadata] field.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     autoMlClient.deleteDatasetAsync(name).get();
   }

  name - The resource name of the dataset to delete. - `com.google.cloud.automl.v1beta1.DatasetName`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.DatasetName name]
    (-> this (.deleteDatasetAsync name))))

(defn list-table-specs-callable
  "Lists table specs in a dataset.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName parent = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     ListTableSpecsRequest request = ListTableSpecsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListTableSpecsResponse response = autoMlClient.listTableSpecsCallable().call(request);
       for (TableSpec element : response.getTableSpecsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListTableSpecsRequest,com.google.cloud.automl.v1beta1.ListTableSpecsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.listTableSpecsCallable))))

(defn update-dataset
  "Updates a dataset.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     Dataset dataset = Dataset.newBuilder().build();
     Dataset response = autoMlClient.updateDataset(dataset);
   }

  dataset - The dataset which replaces the resource on the server. - `com.google.cloud.automl.v1beta1.Dataset`

  returns: `com.google.cloud.automl.v1beta1.Dataset`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.Dataset [^AutoMlClient this ^com.google.cloud.automl.v1beta1.Dataset dataset]
    (-> this (.updateDataset dataset))))

(defn get-model-evaluation
  "Gets a model evaluation.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelEvaluationName name = ModelEvaluationName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\", \"[MODEL_EVALUATION]\");
     ModelEvaluation response = autoMlClient.getModelEvaluation(name);
   }

  name - Resource name for the model evaluation. - `com.google.cloud.automl.v1beta1.ModelEvaluationName`

  returns: `com.google.cloud.automl.v1beta1.ModelEvaluation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.ModelEvaluation [^AutoMlClient this ^com.google.cloud.automl.v1beta1.ModelEvaluationName name]
    (-> this (.getModelEvaluation name))))

(defn create-model-operation-callable
  "Creates a model. Returns a Model in the [response][google.longrunning.Operation.response] field
   when it completes. When you create a model, several model evaluations are created for it: a
   global evaluation, and one evaluation for each annotation spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Model model = Model.newBuilder().build();
     CreateModelRequest request = CreateModelRequest.newBuilder()
       .setParent(parent.toString())
       .setModel(model)
       .build();
     OperationFuture<Model, OperationMetadata> future = autoMlClient.createModelOperationCallable().futureCall(request);
     // Do something
     Model response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.CreateModelRequest,com.google.cloud.automl.v1beta1.Model,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlClient this]
    (-> this (.createModelOperationCallable))))

(defn delete-model-callable
  "Deletes a model. Returns `google.protobuf.Empty` in the
   [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   in the [metadata][google.longrunning.Operation.metadata] field.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     DeleteModelRequest request = DeleteModelRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Operation> future = autoMlClient.deleteModelCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.DeleteModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.deleteModelCallable))))

(defn list-table-specs-paged-callable
  "Lists table specs in a dataset.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName parent = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     ListTableSpecsRequest request = ListTableSpecsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListTableSpecsPagedResponse> future = autoMlClient.listTableSpecsPagedCallable().futureCall(request);
     // Do something
     for (TableSpec element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListTableSpecsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListTableSpecsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.listTableSpecsPagedCallable))))

(defn update-table-spec
  "Updates a table spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     TableSpec tableSpec = TableSpec.newBuilder().build();
     TableSpec response = autoMlClient.updateTableSpec(tableSpec);
   }

  table-spec - The table spec which replaces the resource on the server. - `com.google.cloud.automl.v1beta1.TableSpec`

  returns: `com.google.cloud.automl.v1beta1.TableSpec`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.TableSpec [^AutoMlClient this ^com.google.cloud.automl.v1beta1.TableSpec table-spec]
    (-> this (.updateTableSpec table-spec))))

(defn export-evaluated-examples-callable
  "Exports examples on which the model was evaluated (i.e. which were in the TEST set of the
   dataset the model was created from), together with their ground truth annotations and the
   annotations created (predicted) by the model. The examples, ground truth and predictions are
   exported in the state they were at the moment the model was evaluated.

   This export is available only for 30 days since the model evaluation is created.

   Currently only available for Tables.

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     ExportEvaluatedExamplesOutputConfig outputConfig = ExportEvaluatedExamplesOutputConfig.newBuilder().build();
     ExportEvaluatedExamplesRequest request = ExportEvaluatedExamplesRequest.newBuilder()
       .setName(name.toString())
       .setOutputConfig(outputConfig)
       .build();
     ApiFuture<Operation> future = autoMlClient.exportEvaluatedExamplesCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.exportEvaluatedExamplesCallable))))

(defn create-dataset
  "Creates a dataset.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Dataset dataset = Dataset.newBuilder().build();
     Dataset response = autoMlClient.createDataset(parent, dataset);
   }

  parent - The resource name of the project to create the dataset for. - `com.google.cloud.automl.v1beta1.LocationName`
  dataset - The dataset to create. - `com.google.cloud.automl.v1beta1.Dataset`

  returns: `com.google.cloud.automl.v1beta1.Dataset`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.Dataset [^AutoMlClient this ^com.google.cloud.automl.v1beta1.LocationName parent ^com.google.cloud.automl.v1beta1.Dataset dataset]
    (-> this (.createDataset parent dataset)))
  (^com.google.cloud.automl.v1beta1.Dataset [^AutoMlClient this ^com.google.cloud.automl.v1beta1.CreateDatasetRequest request]
    (-> this (.createDataset request))))

(defn export-model-operation-callable
  "Exports a trained, \"export-able\", model to a user specified Google Cloud Storage location. A
   model is considered export-able if and only if it has an export format defined for it in

   [ModelExportOutputConfig][google.cloud.automl.v1beta1.ModelExportOutputConfig].

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
     ExportModelRequest request = ExportModelRequest.newBuilder()
       .setName(name.toString())
       .setOutputConfig(outputConfig)
       .build();
     OperationFuture<Empty, OperationMetadata> future = autoMlClient.exportModelOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ExportModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlClient this]
    (-> this (.exportModelOperationCallable))))

(defn get-dataset-callable
  "Gets a dataset.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     GetDatasetRequest request = GetDatasetRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Dataset> future = autoMlClient.getDatasetCallable().futureCall(request);
     // Do something
     Dataset response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.getDatasetCallable))))

(defn export-data-async
  "Exports dataset's data to the provided output location. Returns an empty response in the
   [response][google.longrunning.Operation.response] field when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     autoMlClient.exportDataAsync(name, outputConfig).get();
   }

  name - Required. The resource name of the dataset. - `com.google.cloud.automl.v1beta1.DatasetName`
  output-config - Required. The desired output location. - `com.google.cloud.automl.v1beta1.OutputConfig`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.DatasetName name ^com.google.cloud.automl.v1beta1.OutputConfig output-config]
    (-> this (.exportDataAsync name output-config)))
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.ExportDataRequest request]
    (-> this (.exportDataAsync request))))

(defn list-model-evaluations-callable
  "Lists model evaluations.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName parent = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     ListModelEvaluationsRequest request = ListModelEvaluationsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListModelEvaluationsResponse response = autoMlClient.listModelEvaluationsCallable().call(request);
       for (ModelEvaluation element : response.getModelEvaluationList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest,com.google.cloud.automl.v1beta1.ListModelEvaluationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.listModelEvaluationsCallable))))

(defn list-model-evaluations
  "Lists model evaluations.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName parent = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     for (ModelEvaluation element : autoMlClient.listModelEvaluations(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Resource name of the model to list the model evaluations for. If modelId is set as \"-\", this will list model evaluations from across all models of the parent location. - `com.google.cloud.automl.v1beta1.ModelName`

  returns: `com.google.cloud.automl.v1beta1.AutoMlClient$ListModelEvaluationsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.AutoMlClient$ListModelEvaluationsPagedResponse [^AutoMlClient this ^com.google.cloud.automl.v1beta1.ModelName parent]
    (-> this (.listModelEvaluations parent))))

(defn deploy-model-callable
  "Deploys a model. If a model is already deployed, deploying it with the same parameters has no
   effect. Deploying with different parametrs (as e.g. changing

   [node_number][google.cloud.automl.v1beta1.ImageObjectDetectionModelDeploymentMetadata.node_number])
   will reset the deployment state without pausing the model's availability.

   Only applicable for Text Classification, Image Object Detection and Tables; all other
   domains manage deployment automatically.

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     DeployModelRequest request = DeployModelRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Operation> future = autoMlClient.deployModelCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.DeployModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.deployModelCallable))))

(defn get-settings
  "returns: `com.google.cloud.automl.v1beta1.AutoMlSettings`"
  (^com.google.cloud.automl.v1beta1.AutoMlSettings [^AutoMlClient this]
    (-> this (.getSettings))))

(defn delete-model-operation-callable
  "Deletes a model. Returns `google.protobuf.Empty` in the
   [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   in the [metadata][google.longrunning.Operation.metadata] field.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     DeleteModelRequest request = DeleteModelRequest.newBuilder()
       .setName(name.toString())
       .build();
     OperationFuture<Empty, OperationMetadata> future = autoMlClient.deleteModelOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.DeleteModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlClient this]
    (-> this (.deleteModelOperationCallable))))

(defn update-dataset-callable
  "Updates a dataset.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     Dataset dataset = Dataset.newBuilder().build();
     UpdateDatasetRequest request = UpdateDatasetRequest.newBuilder()
       .setDataset(dataset)
       .build();
     ApiFuture<Dataset> future = autoMlClient.updateDatasetCallable().futureCall(request);
     // Do something
     Dataset response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UpdateDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.updateDatasetCallable))))

(defn update-column-spec
  "Updates a column spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ColumnSpec columnSpec = ColumnSpec.newBuilder().build();
     ColumnSpec response = autoMlClient.updateColumnSpec(columnSpec);
   }

  column-spec - The column spec which replaces the resource on the server. - `com.google.cloud.automl.v1beta1.ColumnSpec`

  returns: `com.google.cloud.automl.v1beta1.ColumnSpec`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.ColumnSpec [^AutoMlClient this ^com.google.cloud.automl.v1beta1.ColumnSpec column-spec]
    (-> this (.updateColumnSpec column-spec))))

(defn get-annotation-spec-callable
  "Gets an annotation spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     AnnotationSpecName name = AnnotationSpecName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\", \"[ANNOTATION_SPEC]\");
     GetAnnotationSpecRequest request = GetAnnotationSpecRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<AnnotationSpec> future = autoMlClient.getAnnotationSpecCallable().futureCall(request);
     // Do something
     AnnotationSpec response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetAnnotationSpecRequest,com.google.cloud.automl.v1beta1.AnnotationSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.getAnnotationSpecCallable))))

(defn create-dataset-callable
  "Creates a dataset.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Dataset dataset = Dataset.newBuilder().build();
     CreateDatasetRequest request = CreateDatasetRequest.newBuilder()
       .setParent(parent.toString())
       .setDataset(dataset)
       .build();
     ApiFuture<Dataset> future = autoMlClient.createDatasetCallable().futureCall(request);
     // Do something
     Dataset response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.CreateDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.createDatasetCallable))))

(defn undeploy-model-async
  "Undeploys a model. If the model is not deployed this method has no effect.

   Only applicable for Text Classification, Image Object Detection and Tables; all other
   domains manage deployment automatically.

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     autoMlClient.undeployModelAsync(name).get();
   }

  name - Resource name of the model to undeploy. - `com.google.cloud.automl.v1beta1.ModelName`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.ModelName name]
    (-> this (.undeployModelAsync name))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.automl.v1beta1.stub.AutoMlStub`"
  ([^AutoMlClient this]
    (-> this (.getStub))))

(defn create-model-callable
  "Creates a model. Returns a Model in the [response][google.longrunning.Operation.response] field
   when it completes. When you create a model, several model evaluations are created for it: a
   global evaluation, and one evaluation for each annotation spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Model model = Model.newBuilder().build();
     CreateModelRequest request = CreateModelRequest.newBuilder()
       .setParent(parent.toString())
       .setModel(model)
       .build();
     ApiFuture<Operation> future = autoMlClient.createModelCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.CreateModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.createModelCallable))))

(defn get-dataset
  "Gets a dataset.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     Dataset response = autoMlClient.getDataset(name);
   }

  name - The resource name of the dataset to retrieve. - `com.google.cloud.automl.v1beta1.DatasetName`

  returns: `com.google.cloud.automl.v1beta1.Dataset`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.Dataset [^AutoMlClient this ^com.google.cloud.automl.v1beta1.DatasetName name]
    (-> this (.getDataset name))))

(defn get-column-spec-callable
  "Gets a column spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ColumnSpecName name = ColumnSpecName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\", \"[TABLE_SPEC]\", \"[COLUMN_SPEC]\");
     GetColumnSpecRequest request = GetColumnSpecRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ColumnSpec> future = autoMlClient.getColumnSpecCallable().futureCall(request);
     // Do something
     ColumnSpec response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetColumnSpecRequest,com.google.cloud.automl.v1beta1.ColumnSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.getColumnSpecCallable))))

(defn list-datasets
  "Lists datasets in a project.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     for (Dataset element : autoMlClient.listDatasets(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The resource name of the project from which to list datasets. - `com.google.cloud.automl.v1beta1.LocationName`

  returns: `com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPagedResponse [^AutoMlClient this ^com.google.cloud.automl.v1beta1.LocationName parent]
    (-> this (.listDatasets parent))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^AutoMlClient this]
    (-> this (.isShutdown))))

(defn delete-dataset-callable
  "Deletes a dataset and all of its contents. Returns empty response in the
   [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   in the [metadata][google.longrunning.Operation.metadata] field.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     DeleteDatasetRequest request = DeleteDatasetRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Operation> future = autoMlClient.deleteDatasetCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.DeleteDatasetRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.deleteDatasetCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^AutoMlClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-dataset-operation-callable
  "Deletes a dataset and all of its contents. Returns empty response in the
   [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   in the [metadata][google.longrunning.Operation.metadata] field.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     DeleteDatasetRequest request = DeleteDatasetRequest.newBuilder()
       .setName(name.toString())
       .build();
     OperationFuture<Empty, OperationMetadata> future = autoMlClient.deleteDatasetOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.DeleteDatasetRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlClient this]
    (-> this (.deleteDatasetOperationCallable))))

(defn shutdown
  ""
  ([^AutoMlClient this]
    (-> this (.shutdown))))

(defn get-column-spec
  "Gets a column spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ColumnSpecName name = ColumnSpecName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\", \"[TABLE_SPEC]\", \"[COLUMN_SPEC]\");
     ColumnSpec response = autoMlClient.getColumnSpec(name);
   }

  name - The resource name of the column spec to retrieve. - `com.google.cloud.automl.v1beta1.ColumnSpecName`

  returns: `com.google.cloud.automl.v1beta1.ColumnSpec`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.ColumnSpec [^AutoMlClient this ^com.google.cloud.automl.v1beta1.ColumnSpecName name]
    (-> this (.getColumnSpec name))))

(defn list-table-specs
  "Lists table specs in a dataset.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName parent = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     for (TableSpec element : autoMlClient.listTableSpecs(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The resource name of the dataset to list table specs from. - `com.google.cloud.automl.v1beta1.DatasetName`

  returns: `com.google.cloud.automl.v1beta1.AutoMlClient$ListTableSpecsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.AutoMlClient$ListTableSpecsPagedResponse [^AutoMlClient this ^com.google.cloud.automl.v1beta1.DatasetName parent]
    (-> this (.listTableSpecs parent))))

(defn list-model-evaluations-paged-callable
  "Lists model evaluations.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName parent = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     ListModelEvaluationsRequest request = ListModelEvaluationsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListModelEvaluationsPagedResponse> future = autoMlClient.listModelEvaluationsPagedCallable().futureCall(request);
     // Do something
     for (ModelEvaluation element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListModelEvaluationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.listModelEvaluationsPagedCallable))))

(defn get-model-callable
  "Gets a model.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     GetModelRequest request = GetModelRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Model> future = autoMlClient.getModelCallable().futureCall(request);
     // Do something
     Model response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetModelRequest,com.google.cloud.automl.v1beta1.Model>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.getModelCallable))))

(defn list-models-paged-callable
  "Lists models.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListModelsRequest request = ListModelsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListModelsPagedResponse> future = autoMlClient.listModelsPagedCallable().futureCall(request);
     // Do something
     for (Model element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListModelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.listModelsPagedCallable))))

(defn export-evaluated-examples-operation-callable
  "Exports examples on which the model was evaluated (i.e. which were in the TEST set of the
   dataset the model was created from), together with their ground truth annotations and the
   annotations created (predicted) by the model. The examples, ground truth and predictions are
   exported in the state they were at the moment the model was evaluated.

   This export is available only for 30 days since the model evaluation is created.

   Currently only available for Tables.

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     ExportEvaluatedExamplesOutputConfig outputConfig = ExportEvaluatedExamplesOutputConfig.newBuilder().build();
     ExportEvaluatedExamplesRequest request = ExportEvaluatedExamplesRequest.newBuilder()
       .setName(name.toString())
       .setOutputConfig(outputConfig)
       .build();
     OperationFuture<Empty, OperationMetadata> future = autoMlClient.exportEvaluatedExamplesOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlClient this]
    (-> this (.exportEvaluatedExamplesOperationCallable))))

(defn export-model-callable
  "Exports a trained, \"export-able\", model to a user specified Google Cloud Storage location. A
   model is considered export-able if and only if it has an export format defined for it in

   [ModelExportOutputConfig][google.cloud.automl.v1beta1.ModelExportOutputConfig].

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
     ExportModelRequest request = ExportModelRequest.newBuilder()
       .setName(name.toString())
       .setOutputConfig(outputConfig)
       .build();
     ApiFuture<Operation> future = autoMlClient.exportModelCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ExportModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.exportModelCallable))))

(defn import-data-callable
  "Imports data into a dataset. For Tables this method can only be called on an empty Dataset.

   For Tables: * A
   [schema_inference_version][google.cloud.automl.v1beta1.InputConfig.params] parameter must be
   explicitly set. Returns an empty response in the
   [response][google.longrunning.Operation.response] field when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     InputConfig inputConfig = InputConfig.newBuilder().build();
     ImportDataRequest request = ImportDataRequest.newBuilder()
       .setName(name.toString())
       .setInputConfig(inputConfig)
       .build();
     ApiFuture<Operation> future = autoMlClient.importDataCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ImportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.importDataCallable))))

(defn undeploy-model-callable
  "Undeploys a model. If the model is not deployed this method has no effect.

   Only applicable for Text Classification, Image Object Detection and Tables; all other
   domains manage deployment automatically.

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     UndeployModelRequest request = UndeployModelRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Operation> future = autoMlClient.undeployModelCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UndeployModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.undeployModelCallable))))

(defn deploy-model-operation-callable
  "Deploys a model. If a model is already deployed, deploying it with the same parameters has no
   effect. Deploying with different parametrs (as e.g. changing

   [node_number][google.cloud.automl.v1beta1.ImageObjectDetectionModelDeploymentMetadata.node_number])
   will reset the deployment state without pausing the model's availability.

   Only applicable for Text Classification, Image Object Detection and Tables; all other
   domains manage deployment automatically.

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     DeployModelRequest request = DeployModelRequest.newBuilder()
       .setName(name.toString())
       .build();
     OperationFuture<Empty, OperationMetadata> future = autoMlClient.deployModelOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.DeployModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlClient this]
    (-> this (.deployModelOperationCallable))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^AutoMlClient this]
    (-> this (.getOperationsClient))))

(defn delete-model-async
  "Deletes a model. Returns `google.protobuf.Empty` in the
   [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   in the [metadata][google.longrunning.Operation.metadata] field.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     autoMlClient.deleteModelAsync(name).get();
   }

  name - Resource name of the model being deleted. - `com.google.cloud.automl.v1beta1.ModelName`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.ModelName name]
    (-> this (.deleteModelAsync name))))

(defn export-evaluated-examples-async
  "Exports examples on which the model was evaluated (i.e. which were in the TEST set of the
   dataset the model was created from), together with their ground truth annotations and the
   annotations created (predicted) by the model. The examples, ground truth and predictions are
   exported in the state they were at the moment the model was evaluated.

   This export is available only for 30 days since the model evaluation is created.

   Currently only available for Tables.

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     ExportEvaluatedExamplesOutputConfig outputConfig = ExportEvaluatedExamplesOutputConfig.newBuilder().build();
     ExportEvaluatedExamplesRequest request = ExportEvaluatedExamplesRequest.newBuilder()
       .setName(name.toString())
       .setOutputConfig(outputConfig)
       .build();
     autoMlClient.exportEvaluatedExamplesAsync(request).get();
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest request]
    (-> this (.exportEvaluatedExamplesAsync request))))

(defn list-datasets-callable
  "Lists datasets in a project.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListDatasetsRequest request = ListDatasetsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListDatasetsResponse response = autoMlClient.listDatasetsCallable().call(request);
       for (Dataset element : response.getDatasetsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListDatasetsRequest,com.google.cloud.automl.v1beta1.ListDatasetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.listDatasetsCallable))))

(defn export-model-async
  "Exports a trained, \"export-able\", model to a user specified Google Cloud Storage location. A
   model is considered export-able if and only if it has an export format defined for it in

   [ModelExportOutputConfig][google.cloud.automl.v1beta1.ModelExportOutputConfig].

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
     ExportModelRequest request = ExportModelRequest.newBuilder()
       .setName(name.toString())
       .setOutputConfig(outputConfig)
       .build();
     autoMlClient.exportModelAsync(request).get();
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.automl.v1beta1.ExportModelRequest`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.ExportModelRequest request]
    (-> this (.exportModelAsync request))))

(defn close
  ""
  ([^AutoMlClient this]
    (-> this (.close))))

(defn get-annotation-spec
  "Gets an annotation spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     AnnotationSpecName name = AnnotationSpecName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\", \"[ANNOTATION_SPEC]\");
     AnnotationSpec response = autoMlClient.getAnnotationSpec(name);
   }

  name - The resource name of the annotation spec to retrieve. - `com.google.cloud.automl.v1beta1.AnnotationSpecName`

  returns: `com.google.cloud.automl.v1beta1.AnnotationSpec`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.AnnotationSpec [^AutoMlClient this ^com.google.cloud.automl.v1beta1.AnnotationSpecName name]
    (-> this (.getAnnotationSpec name))))

(defn list-column-specs-callable
  "Lists column specs in a table spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     TableSpecName parent = TableSpecName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\", \"[TABLE_SPEC]\");
     ListColumnSpecsRequest request = ListColumnSpecsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListColumnSpecsResponse response = autoMlClient.listColumnSpecsCallable().call(request);
       for (ColumnSpec element : response.getColumnSpecsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListColumnSpecsRequest,com.google.cloud.automl.v1beta1.ListColumnSpecsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.listColumnSpecsCallable))))

(defn create-model-async
  "Creates a model. Returns a Model in the [response][google.longrunning.Operation.response] field
   when it completes. When you create a model, several model evaluations are created for it: a
   global evaluation, and one evaluation for each annotation spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Model model = Model.newBuilder().build();
     Model response = autoMlClient.createModelAsync(parent, model).get();
   }

  parent - Resource name of the parent project where the model is being created. - `com.google.cloud.automl.v1beta1.LocationName`
  model - The model to create. - `com.google.cloud.automl.v1beta1.Model`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.automl.v1beta1.Model,com.google.cloud.automl.v1beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.LocationName parent ^com.google.cloud.automl.v1beta1.Model model]
    (-> this (.createModelAsync parent model)))
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.CreateModelRequest request]
    (-> this (.createModelAsync request))))

(defn get-model-evaluation-callable
  "Gets a model evaluation.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelEvaluationName name = ModelEvaluationName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\", \"[MODEL_EVALUATION]\");
     GetModelEvaluationRequest request = GetModelEvaluationRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ModelEvaluation> future = autoMlClient.getModelEvaluationCallable().futureCall(request);
     // Do something
     ModelEvaluation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetModelEvaluationRequest,com.google.cloud.automl.v1beta1.ModelEvaluation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.getModelEvaluationCallable))))

(defn list-column-specs-paged-callable
  "Lists column specs in a table spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     TableSpecName parent = TableSpecName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\", \"[TABLE_SPEC]\");
     ListColumnSpecsRequest request = ListColumnSpecsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListColumnSpecsPagedResponse> future = autoMlClient.listColumnSpecsPagedCallable().futureCall(request);
     // Do something
     for (ColumnSpec element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListColumnSpecsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.listColumnSpecsPagedCallable))))

(defn list-column-specs
  "Lists column specs in a table spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     TableSpecName parent = TableSpecName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\", \"[TABLE_SPEC]\");
     for (ColumnSpec element : autoMlClient.listColumnSpecs(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The resource name of the table spec to list column specs from. - `com.google.cloud.automl.v1beta1.TableSpecName`

  returns: `com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPagedResponse [^AutoMlClient this ^com.google.cloud.automl.v1beta1.TableSpecName parent]
    (-> this (.listColumnSpecs parent))))

(defn export-data-operation-callable
  "Exports dataset's data to the provided output location. Returns an empty response in the
   [response][google.longrunning.Operation.response] field when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     ExportDataRequest request = ExportDataRequest.newBuilder()
       .setName(name.toString())
       .setOutputConfig(outputConfig)
       .build();
     OperationFuture<Empty, OperationMetadata> future = autoMlClient.exportDataOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ExportDataRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlClient this]
    (-> this (.exportDataOperationCallable))))

(defn update-table-spec-callable
  "Updates a table spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     TableSpec tableSpec = TableSpec.newBuilder().build();
     UpdateTableSpecRequest request = UpdateTableSpecRequest.newBuilder()
       .setTableSpec(tableSpec)
       .build();
     ApiFuture<TableSpec> future = autoMlClient.updateTableSpecCallable().futureCall(request);
     // Do something
     TableSpec response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UpdateTableSpecRequest,com.google.cloud.automl.v1beta1.TableSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.updateTableSpecCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^AutoMlClient this]
    (-> this (.isTerminated))))

(defn list-datasets-paged-callable
  "Lists datasets in a project.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListDatasetsRequest request = ListDatasetsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListDatasetsPagedResponse> future = autoMlClient.listDatasetsPagedCallable().futureCall(request);
     // Do something
     for (Dataset element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListDatasetsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.listDatasetsPagedCallable))))

(defn import-data-async
  "Imports data into a dataset. For Tables this method can only be called on an empty Dataset.

   For Tables: * A
   [schema_inference_version][google.cloud.automl.v1beta1.InputConfig.params] parameter must be
   explicitly set. Returns an empty response in the
   [response][google.longrunning.Operation.response] field when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     InputConfig inputConfig = InputConfig.newBuilder().build();
     autoMlClient.importDataAsync(name, inputConfig).get();
   }

  name - Required. Dataset name. Dataset must already exist. All imported annotations and examples will be added. - `com.google.cloud.automl.v1beta1.DatasetName`
  input-config - Required. The desired input location and its domain specific semantics, if any. - `com.google.cloud.automl.v1beta1.InputConfig`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.DatasetName name ^com.google.cloud.automl.v1beta1.InputConfig input-config]
    (-> this (.importDataAsync name input-config)))
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.ImportDataRequest request]
    (-> this (.importDataAsync request))))

(defn deploy-model-async
  "Deploys a model. If a model is already deployed, deploying it with the same parameters has no
   effect. Deploying with different parametrs (as e.g. changing

   [node_number][google.cloud.automl.v1beta1.ImageObjectDetectionModelDeploymentMetadata.node_number])
   will reset the deployment state without pausing the model's availability.

   Only applicable for Text Classification, Image Object Detection and Tables; all other
   domains manage deployment automatically.

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     autoMlClient.deployModelAsync(name).get();
   }

  name - Resource name of the model to deploy. - `com.google.cloud.automl.v1beta1.ModelName`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AutoMlClient this ^com.google.cloud.automl.v1beta1.ModelName name]
    (-> this (.deployModelAsync name))))

(defn get-model
  "Gets a model.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     Model response = autoMlClient.getModel(name);
   }

  name - Resource name of the model. - `com.google.cloud.automl.v1beta1.ModelName`

  returns: `com.google.cloud.automl.v1beta1.Model`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.Model [^AutoMlClient this ^com.google.cloud.automl.v1beta1.ModelName name]
    (-> this (.getModel name))))

(defn get-table-spec
  "Gets a table spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     TableSpecName name = TableSpecName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\", \"[TABLE_SPEC]\");
     TableSpec response = autoMlClient.getTableSpec(name);
   }

  name - The resource name of the table spec to retrieve. - `com.google.cloud.automl.v1beta1.TableSpecName`

  returns: `com.google.cloud.automl.v1beta1.TableSpec`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.TableSpec [^AutoMlClient this ^com.google.cloud.automl.v1beta1.TableSpecName name]
    (-> this (.getTableSpec name))))

(defn import-data-operation-callable
  "Imports data into a dataset. For Tables this method can only be called on an empty Dataset.

   For Tables: * A
   [schema_inference_version][google.cloud.automl.v1beta1.InputConfig.params] parameter must be
   explicitly set. Returns an empty response in the
   [response][google.longrunning.Operation.response] field when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     InputConfig inputConfig = InputConfig.newBuilder().build();
     ImportDataRequest request = ImportDataRequest.newBuilder()
       .setName(name.toString())
       .setInputConfig(inputConfig)
       .build();
     OperationFuture<Empty, OperationMetadata> future = autoMlClient.importDataOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ImportDataRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlClient this]
    (-> this (.importDataOperationCallable))))

(defn update-column-spec-callable
  "Updates a column spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ColumnSpec columnSpec = ColumnSpec.newBuilder().build();
     UpdateColumnSpecRequest request = UpdateColumnSpecRequest.newBuilder()
       .setColumnSpec(columnSpec)
       .build();
     ApiFuture<ColumnSpec> future = autoMlClient.updateColumnSpecCallable().futureCall(request);
     // Do something
     ColumnSpec response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest,com.google.cloud.automl.v1beta1.ColumnSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.updateColumnSpecCallable))))

(defn export-data-callable
  "Exports dataset's data to the provided output location. Returns an empty response in the
   [response][google.longrunning.Operation.response] field when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     DatasetName name = DatasetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\");
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     ExportDataRequest request = ExportDataRequest.newBuilder()
       .setName(name.toString())
       .setOutputConfig(outputConfig)
       .build();
     ApiFuture<Operation> future = autoMlClient.exportDataCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ExportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.exportDataCallable))))

(defn undeploy-model-operation-callable
  "Undeploys a model. If the model is not deployed this method has no effect.

   Only applicable for Text Classification, Image Object Detection and Tables; all other
   domains manage deployment automatically.

   Returns an empty response in the [response][google.longrunning.Operation.response] field
   when it completes.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     UndeployModelRequest request = UndeployModelRequest.newBuilder()
       .setName(name.toString())
       .build();
     OperationFuture<Empty, OperationMetadata> future = autoMlClient.undeployModelOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.UndeployModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlClient this]
    (-> this (.undeployModelOperationCallable))))

(defn shutdown-now
  ""
  ([^AutoMlClient this]
    (-> this (.shutdownNow))))

(defn list-models-callable
  "Lists models.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListModelsRequest request = ListModelsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListModelsResponse response = autoMlClient.listModelsCallable().call(request);
       for (Model element : response.getModelList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelsRequest,com.google.cloud.automl.v1beta1.ListModelsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.listModelsCallable))))

(defn get-table-spec-callable
  "Gets a table spec.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     TableSpecName name = TableSpecName.of(\"[PROJECT]\", \"[LOCATION]\", \"[DATASET]\", \"[TABLE_SPEC]\");
     GetTableSpecRequest request = GetTableSpecRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<TableSpec> future = autoMlClient.getTableSpecCallable().futureCall(request);
     // Do something
     TableSpec response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetTableSpecRequest,com.google.cloud.automl.v1beta1.TableSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlClient this]
    (-> this (.getTableSpecCallable))))

(defn list-models
  "Lists models.

   Sample code:



   try (AutoMlClient autoMlClient = AutoMlClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     for (Model element : autoMlClient.listModels(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Resource name of the project, from which to list the models. - `com.google.cloud.automl.v1beta1.LocationName`

  returns: `com.google.cloud.automl.v1beta1.AutoMlClient$ListModelsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.AutoMlClient$ListModelsPagedResponse [^AutoMlClient this ^com.google.cloud.automl.v1beta1.LocationName parent]
    (-> this (.listModels parent))))

