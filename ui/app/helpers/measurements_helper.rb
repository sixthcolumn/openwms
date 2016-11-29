module MeasurementsHelper

   def get_num_measurements(meas)
      if meas
         return meas.length
      end
   end
end
