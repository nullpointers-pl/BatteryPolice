package pl.nullpointers.batterypolice.ui.notifications;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import androidx.fragment.app.Fragment;

import pl.nullpointers.batterypolice.R;

public class NotificationsFragment extends Fragment {

    // we have to contain the preferencefragment type inside of androidx fragment because it doesn't extend the type of the latter
    public void onActivityCreated(Bundle instanceState) {
        super.onActivityCreated(instanceState);

        getActivity().getFragmentManager().beginTransaction().replace(
                android.R.id.content,
                new SettingsPrefFragment()
        ).commit();
    }

    public static class SettingsPrefFragment extends PreferenceFragment {
        public SettingsPrefFragment() {}

        @Override
        public void onCreate(Bundle instanceState) {
            super.onCreate(instanceState);

            addPreferencesFromResource(R.xml.settings);
        }
    }
}