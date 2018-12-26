// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

/**
 * Protobuf type {@code didi.cloud.bill.v1.CheckDc2PriceRequest}
 */
public  final class CheckDc2PriceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.bill.v1.CheckDc2PriceRequest)
    CheckDc2PriceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckDc2PriceRequest.newBuilder() to construct.
  private CheckDc2PriceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckDc2PriceRequest() {
    checkCoupon_ = false;
    isChange_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckDc2PriceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.didiyun.base.v1.Header.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.didiyun.base.v1.Header.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            checkCoupon_ = input.readBool();
            break;
          }
          case 24: {

            isChange_ = input.readBool();
            break;
          }
          case 34: {
            com.didiyun.bill.v1.CheckDc2PriceInput.Builder subBuilder = null;
            if (dc2Goods_ != null) {
              subBuilder = dc2Goods_.toBuilder();
            }
            dc2Goods_ = input.readMessage(com.didiyun.bill.v1.CheckDc2PriceInput.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dc2Goods_);
              dc2Goods_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckDc2PriceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckDc2PriceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.bill.v1.CheckDc2PriceRequest.class, com.didiyun.bill.v1.CheckDc2PriceRequest.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.didiyun.base.v1.Header header_;
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.Header getHeader() {
    return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int CHECKCOUPON_FIELD_NUMBER = 2;
  private boolean checkCoupon_;
  /**
   * <code>bool checkCoupon = 2;</code>
   */
  public boolean getCheckCoupon() {
    return checkCoupon_;
  }

  public static final int ISCHANGE_FIELD_NUMBER = 3;
  private boolean isChange_;
  /**
   * <code>bool isChange = 3;</code>
   */
  public boolean getIsChange() {
    return isChange_;
  }

  public static final int DC2GOODS_FIELD_NUMBER = 4;
  private com.didiyun.bill.v1.CheckDc2PriceInput dc2Goods_;
  /**
   * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
   */
  public boolean hasDc2Goods() {
    return dc2Goods_ != null;
  }
  /**
   * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
   */
  public com.didiyun.bill.v1.CheckDc2PriceInput getDc2Goods() {
    return dc2Goods_ == null ? com.didiyun.bill.v1.CheckDc2PriceInput.getDefaultInstance() : dc2Goods_;
  }
  /**
   * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
   */
  public com.didiyun.bill.v1.CheckDc2PriceInputOrBuilder getDc2GoodsOrBuilder() {
    return getDc2Goods();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (checkCoupon_ != false) {
      output.writeBool(2, checkCoupon_);
    }
    if (isChange_ != false) {
      output.writeBool(3, isChange_);
    }
    if (dc2Goods_ != null) {
      output.writeMessage(4, getDc2Goods());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (checkCoupon_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, checkCoupon_);
    }
    if (isChange_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isChange_);
    }
    if (dc2Goods_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getDc2Goods());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.didiyun.bill.v1.CheckDc2PriceRequest)) {
      return super.equals(obj);
    }
    com.didiyun.bill.v1.CheckDc2PriceRequest other = (com.didiyun.bill.v1.CheckDc2PriceRequest) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && (getCheckCoupon()
        == other.getCheckCoupon());
    result = result && (getIsChange()
        == other.getIsChange());
    result = result && (hasDc2Goods() == other.hasDc2Goods());
    if (hasDc2Goods()) {
      result = result && getDc2Goods()
          .equals(other.getDc2Goods());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + CHECKCOUPON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCheckCoupon());
    hash = (37 * hash) + ISCHANGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsChange());
    if (hasDc2Goods()) {
      hash = (37 * hash) + DC2GOODS_FIELD_NUMBER;
      hash = (53 * hash) + getDc2Goods().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.CheckDc2PriceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.didiyun.bill.v1.CheckDc2PriceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code didi.cloud.bill.v1.CheckDc2PriceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.bill.v1.CheckDc2PriceRequest)
      com.didiyun.bill.v1.CheckDc2PriceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckDc2PriceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckDc2PriceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.bill.v1.CheckDc2PriceRequest.class, com.didiyun.bill.v1.CheckDc2PriceRequest.Builder.class);
    }

    // Construct using com.didiyun.bill.v1.CheckDc2PriceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      checkCoupon_ = false;

      isChange_ = false;

      if (dc2GoodsBuilder_ == null) {
        dc2Goods_ = null;
      } else {
        dc2Goods_ = null;
        dc2GoodsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckDc2PriceRequest_descriptor;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.CheckDc2PriceRequest getDefaultInstanceForType() {
      return com.didiyun.bill.v1.CheckDc2PriceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.bill.v1.CheckDc2PriceRequest build() {
      com.didiyun.bill.v1.CheckDc2PriceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.CheckDc2PriceRequest buildPartial() {
      com.didiyun.bill.v1.CheckDc2PriceRequest result = new com.didiyun.bill.v1.CheckDc2PriceRequest(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.checkCoupon_ = checkCoupon_;
      result.isChange_ = isChange_;
      if (dc2GoodsBuilder_ == null) {
        result.dc2Goods_ = dc2Goods_;
      } else {
        result.dc2Goods_ = dc2GoodsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.didiyun.bill.v1.CheckDc2PriceRequest) {
        return mergeFrom((com.didiyun.bill.v1.CheckDc2PriceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.bill.v1.CheckDc2PriceRequest other) {
      if (other == com.didiyun.bill.v1.CheckDc2PriceRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getCheckCoupon() != false) {
        setCheckCoupon(other.getCheckCoupon());
      }
      if (other.getIsChange() != false) {
        setIsChange(other.getIsChange());
      }
      if (other.hasDc2Goods()) {
        mergeDc2Goods(other.getDc2Goods());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.didiyun.bill.v1.CheckDc2PriceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.bill.v1.CheckDc2PriceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.didiyun.base.v1.Header header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(
        com.didiyun.base.v1.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder mergeHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.didiyun.base.v1.Header.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private boolean checkCoupon_ ;
    /**
     * <code>bool checkCoupon = 2;</code>
     */
    public boolean getCheckCoupon() {
      return checkCoupon_;
    }
    /**
     * <code>bool checkCoupon = 2;</code>
     */
    public Builder setCheckCoupon(boolean value) {
      
      checkCoupon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool checkCoupon = 2;</code>
     */
    public Builder clearCheckCoupon() {
      
      checkCoupon_ = false;
      onChanged();
      return this;
    }

    private boolean isChange_ ;
    /**
     * <code>bool isChange = 3;</code>
     */
    public boolean getIsChange() {
      return isChange_;
    }
    /**
     * <code>bool isChange = 3;</code>
     */
    public Builder setIsChange(boolean value) {
      
      isChange_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isChange = 3;</code>
     */
    public Builder clearIsChange() {
      
      isChange_ = false;
      onChanged();
      return this;
    }

    private com.didiyun.bill.v1.CheckDc2PriceInput dc2Goods_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.bill.v1.CheckDc2PriceInput, com.didiyun.bill.v1.CheckDc2PriceInput.Builder, com.didiyun.bill.v1.CheckDc2PriceInputOrBuilder> dc2GoodsBuilder_;
    /**
     * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
     */
    public boolean hasDc2Goods() {
      return dc2GoodsBuilder_ != null || dc2Goods_ != null;
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
     */
    public com.didiyun.bill.v1.CheckDc2PriceInput getDc2Goods() {
      if (dc2GoodsBuilder_ == null) {
        return dc2Goods_ == null ? com.didiyun.bill.v1.CheckDc2PriceInput.getDefaultInstance() : dc2Goods_;
      } else {
        return dc2GoodsBuilder_.getMessage();
      }
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
     */
    public Builder setDc2Goods(com.didiyun.bill.v1.CheckDc2PriceInput value) {
      if (dc2GoodsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dc2Goods_ = value;
        onChanged();
      } else {
        dc2GoodsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
     */
    public Builder setDc2Goods(
        com.didiyun.bill.v1.CheckDc2PriceInput.Builder builderForValue) {
      if (dc2GoodsBuilder_ == null) {
        dc2Goods_ = builderForValue.build();
        onChanged();
      } else {
        dc2GoodsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
     */
    public Builder mergeDc2Goods(com.didiyun.bill.v1.CheckDc2PriceInput value) {
      if (dc2GoodsBuilder_ == null) {
        if (dc2Goods_ != null) {
          dc2Goods_ =
            com.didiyun.bill.v1.CheckDc2PriceInput.newBuilder(dc2Goods_).mergeFrom(value).buildPartial();
        } else {
          dc2Goods_ = value;
        }
        onChanged();
      } else {
        dc2GoodsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
     */
    public Builder clearDc2Goods() {
      if (dc2GoodsBuilder_ == null) {
        dc2Goods_ = null;
        onChanged();
      } else {
        dc2Goods_ = null;
        dc2GoodsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
     */
    public com.didiyun.bill.v1.CheckDc2PriceInput.Builder getDc2GoodsBuilder() {
      
      onChanged();
      return getDc2GoodsFieldBuilder().getBuilder();
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
     */
    public com.didiyun.bill.v1.CheckDc2PriceInputOrBuilder getDc2GoodsOrBuilder() {
      if (dc2GoodsBuilder_ != null) {
        return dc2GoodsBuilder_.getMessageOrBuilder();
      } else {
        return dc2Goods_ == null ?
            com.didiyun.bill.v1.CheckDc2PriceInput.getDefaultInstance() : dc2Goods_;
      }
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckDc2PriceInput dc2Goods = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.bill.v1.CheckDc2PriceInput, com.didiyun.bill.v1.CheckDc2PriceInput.Builder, com.didiyun.bill.v1.CheckDc2PriceInputOrBuilder> 
        getDc2GoodsFieldBuilder() {
      if (dc2GoodsBuilder_ == null) {
        dc2GoodsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.bill.v1.CheckDc2PriceInput, com.didiyun.bill.v1.CheckDc2PriceInput.Builder, com.didiyun.bill.v1.CheckDc2PriceInputOrBuilder>(
                getDc2Goods(),
                getParentForChildren(),
                isClean());
        dc2Goods_ = null;
      }
      return dc2GoodsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:didi.cloud.bill.v1.CheckDc2PriceRequest)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.bill.v1.CheckDc2PriceRequest)
  private static final com.didiyun.bill.v1.CheckDc2PriceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.bill.v1.CheckDc2PriceRequest();
  }

  public static com.didiyun.bill.v1.CheckDc2PriceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckDc2PriceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CheckDc2PriceRequest>() {
    @java.lang.Override
    public CheckDc2PriceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckDc2PriceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckDc2PriceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckDc2PriceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.bill.v1.CheckDc2PriceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
