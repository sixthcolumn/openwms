class ObjectrefsController < ApplicationController
  before_action :set_objectref, only: [:show, :edit, :update, :destroy]

  # GET /objectrefs
  # GET /objectrefs.json
  def index
    @objectrefs = Objectref.all
  end

  # GET /objectrefs/1
  # GET /objectrefs/1.json
  def show
  end

  # GET /objectrefs/new
  def new
    @objectref = Objectref.new
  end

  # GET /objectrefs/1/edit
  def edit
  end

  # POST /objectrefs
  # POST /objectrefs.json
  def create
    @objectref = Objectref.new(objectref_params)

    respond_to do |format|
      if @objectref.save
        format.html { redirect_to @objectref, notice: 'Objectref was successfully created.' }
        format.json { render :show, status: :created, location: @objectref }
      else
        format.html { render :new }
        format.json { render json: @objectref.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /objectrefs/1
  # PATCH/PUT /objectrefs/1.json
  def update
    respond_to do |format|
      if @objectref.update(objectref_params)
        format.html { redirect_to @objectref, notice: 'Objectref was successfully updated.' }
        format.json { render :show, status: :ok, location: @objectref }
      else
        format.html { render :edit }
        format.json { render json: @objectref.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /objectrefs/1
  # DELETE /objectrefs/1.json
  def destroy
    @objectref.destroy
    respond_to do |format|
      format.html { redirect_to objectrefs_url, notice: 'Objectref was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_objectref
      @objectref = Objectref.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def objectref_params
      params.require(:objectref).permit(:primary_name, :secondary_name, :noun, :object_guid, :utility, :registered_name, :system_name)
    end
end
